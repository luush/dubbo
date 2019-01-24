package org.lszjaf.dagger;

import org.apache.zookeeper.*;
import org.apache.zookeeper.data.Stat;

public class ZookeeperTest {


    public static void main(String[] luush) throws Exception {
        ZooKeeper zooKeeper = new ZooKeeper("127.0.0.1:2182", 30000, new TestWatch());
        System.out.println(zooKeeper);
        String node = "/node2";
        Stat stat = zooKeeper.exists(node,false);
        if(stat==null){
            String createResult = zooKeeper.create(node,"Joybana".getBytes(),ZooDefs.Ids.OPEN_ACL_UNSAFE
            ,CreateMode.PERSISTENT);
            System.out.println(createResult);
        }

//        Thread.sleep(5000);
        byte[] bytes = zooKeeper.getData(node,false,stat);
        System.out.println(new String(bytes));
        zooKeeper.close();
    }
}

class TestWatch implements Watcher {

    @Override
    public void process(WatchedEvent watchedEvent) {
        System.out.println("----------------------------start");
        System.out.println("----------------------------path:" + watchedEvent.getPath());
        System.out.println("----------------------------state:" + watchedEvent.getState());
        System.out.println("----------------------------type:" + watchedEvent.getType());
        System.out.println("----------------------------wrapper" + watchedEvent.getWrapper());
        System.out.println("----------------------------end");
    }
}