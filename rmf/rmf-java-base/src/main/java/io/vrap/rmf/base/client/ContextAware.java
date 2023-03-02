
package io.vrap.rmf.base.client;

import java.util.Map;

public interface ContextAware<U> {
    public Map<Object, Object> getContextMap();

    public U withContextMap(final Map<Object, Object> contextMap);

    public <T> U addContext(T value);

    public Object getContext(Object key);

    public <T> T getContext(Class<T> key);

    public U addContext(Object key, Object value);
}
