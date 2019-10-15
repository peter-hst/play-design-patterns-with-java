package hst.peter.patterns.observer.first;

/**
 * 主题/发布者接口
 */
public interface Subject {
    /**
     * 注册订阅者
     * @param observer
     */
    void registerObserver(Observer observer);

    /**
     * 删除订阅者
     * @param observer
     */
    void removeObserver(Observer observer);

    /**
     * 通知订阅者
     */
    void notifyObservers();
}
