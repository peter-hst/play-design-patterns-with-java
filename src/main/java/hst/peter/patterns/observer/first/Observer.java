package hst.peter.patterns.observer.first;

/**
 * 订阅者
 */
public interface Observer {

    /**
     * 更新数据
     * @param temp
     * @param humidity
     * @param presure
     */
    void update(float temp, float humidity, float presure);
}
