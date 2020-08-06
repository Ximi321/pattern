package com.ximi.design.pattern.memento;

import java.util.LinkedList;

/**
 * 快照的持有者
 *
 * @author Ximi
 * @since 2020/08/06
 */
public class SnapshotHolder {

    LinkedList<Snapshot> snapshots = new LinkedList<>();

    /**
     * 保持一个快照
     *
     * @param snapshot
     */
    public void pushSnapshot(Snapshot snapshot) {
        snapshots.push(snapshot);
    }

    /**
     * 取出最近的快照
     *
     * @return
     */
    public Snapshot popSnapshot() {
        return snapshots.pop();
    }
}
