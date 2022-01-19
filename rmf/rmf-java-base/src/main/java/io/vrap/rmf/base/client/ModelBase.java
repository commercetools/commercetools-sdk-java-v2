
package io.vrap.rmf.base.client;

import java.time.ZonedDateTime;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.builder.RecursiveToStringStyle;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public interface ModelBase {

    class FilteredRecursiveToStringStyle extends RecursiveToStringStyle {
        static Map<Class<?>, Boolean> filter;
        static {
            filter = new HashMap<>();
            filter.put(ZonedDateTime.class, true);
        }

        public FilteredRecursiveToStringStyle() {
            this.setUseShortClassName(true);
            this.setUseIdentityHashCode(false);
        }

        @Override
        protected boolean accept(Class<?> clazz) {
            return !filter.containsKey(clazz);
        }
    }

    default public String reflectionString() {
        return ReflectionToStringBuilder.reflectionToString(this, new FilteredRecursiveToStringStyle());
    }
}
