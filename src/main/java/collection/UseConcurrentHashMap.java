package collection;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 *
 * @author
 */
public class UseConcurrentHashMap {


    public static void main(String[] args) {

        Map map = new ConcurrentHashMap();
        map.put("","");
        /** Implementation for put and putIfAbsent */

//        final V putVal(K key, V value, boolean onlyIfAbsent) {
//            if (key == null || value == null) throw new NullPointerException();
//            //计算hash值，两次hash操作int binCount = 0;
//            int hash = spread(key.hashCode());
//            int binCount = 0;
//            //类似于while(true)，死循环，直到插入成功
//            for (Node<K,V>[] tab = table;;) {
//                Node<K,V> f; int n, i, fh;
//                //检查是否初始化了，如果没有，则初始化
//                if (tab == null || (n = tab.length) == 0)
//                    tab = initTable();
//                    //i=(n-1)&hash 等价于i=hash%n(前提是n为2的幂次方).即取出table中位置的节点用f表示。
//                    //有如下两种情况：
//                    //1.如果table[i]==null(即该位置的节点为空，没有发生碰撞)，
//                    则利用CAS操作直接存储在该位置，如果CAS操作成功则退出死循环。
//                else if ((f = tabAt(tab, i = (n - 1) & hash)) == null) {
//                    if (casTabAt(tab, i, null,
//                            new Node<K,V>(hash, key, value, null)))
//                        break;                   // no lock when adding to empty bin
//                }
//                //检查table[i]的节点的hash是否等于MOVED，如果等于，则检测到正在扩容，
//                else if ((fh = f.hash) == MOVED)
//                    //帮助其扩容
//                    tab = helpTransfer(tab, f);
//                    //运行到这里，说明table[i]的节点的hash值不等于MOVED
//                else {
//                    V oldVal = null;
//                    //锁定,（hash值相同的链表的头节点）
//                    synchronized (f) {
//                        //避免多线程，需要重新检查
//                        if (tabAt(tab, i) == f) {
//                            //链表节点
//                            if (fh >= 0) {
//                                binCount = 1;
//                                //下面的代码就是先查找链表中是否出现了此key，如果出现，则更新value，并跳出循环，
//                                //否则将节点加入到列表末尾并跳出循环
//                                for (Node<K,V> e = f;; ++binCount) {
//                                    K ek;
//                                    if (e.hash == hash &&
//                                            ((ek = e.key) == key ||
//                                                    (ek != null && key.equals(ek)))) {
//                                        oldVal = e.val;
//                                        //仅putIfAbsent()方法中onlyIfAbsent为true
//                                        if (!onlyIfAbsent)
//                                            e.val = value;
//                                        break;
//                                    }
//                                    Node<K,V> pred = e;
//                                    //插入到链表末尾并跳出循环
//                                    if ((e = e.next) == null) {
//                                        pred.next = new Node<K,V>(hash, key,
//                                                value, null);
//                                        break;
//                                    }
//                                }
//                            }
//                            //如果是一个树节点，
//                            else if (f instanceof TreeBin) {
//                                Node<K,V> p;
//                                binCount = 2;
//                                //插入到树中
//                                if ((p = ((TreeBin<K,V>)f).putTreeVal(hash, key,
//                                        value)) != null) {
//                                    oldVal = p.val;
//                                    if (!onlyIfAbsent)
//                                        p.val = value;
//                                }
//                            }
//                        }
//                    }
//                    if (binCount != 0) {
//                        // 插入成功后，如果插入的是链表节点，则要判断下该桶位是否要转化为树if (binCount != 0) {
//                        // 实则是 > 8,执行else,说明该桶位本就有Node
//                        if (binCount >= TREEIFY_THRESHOLD)
//                            //若length<64,直接tryPresize,两倍table.length;不转树 if (oldVal != null)
//                            //这里是为了避免table 过小的时候就进行转换成树的。
//                            treeifyBin(tab, i);
//                        if (oldVal != null)
//                            return oldVal;
//                        break;
//                    }
//                }
//            }
//            addCount(1L, binCount);
//            return null;
//        }

        map.get("");
    }
}
