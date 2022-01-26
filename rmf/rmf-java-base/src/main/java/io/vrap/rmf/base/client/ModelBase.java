
package io.vrap.rmf.base.client;

import java.time.ZonedDateTime;
import java.util.HashSet;
import java.util.Set;

import org.apache.commons.lang3.builder.RecursiveToStringStyle;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public interface ModelBase {

    class FilteredRecursiveToStringStyle extends RecursiveToStringStyle {
        static Set<Class<?>> filter;
        static {
            filter = new HashSet<>();
            filter.add(ZonedDateTime.class);
            filter.add(Enum.class);
        }

        public FilteredRecursiveToStringStyle() {
            this.setUseShortClassName(true);
            this.setUseIdentityHashCode(false);
        }

        @Override
        protected boolean accept(Class<?> clazz) {
            return filter.stream().noneMatch(aClass -> aClass.isAssignableFrom(clazz));
        }
    }

    default public String reflectionString() {
        return ReflectionToStringBuilder.reflectionToString(this, new FilteredRecursiveToStringStyle());
    }

    default public String reflectionString(ToStringStyle toStringStyle) {
        return ReflectionToStringBuilder.reflectionToString(this, toStringStyle);
    }

    static ModelBase asModelBase(Object object) {
        if (!(object instanceof ModelBase)) {
            throw new IllegalArgumentException("argument must be of type " + ModelBase.class);
        }
        return (ModelBase) object;
    }

    static String reflectionString(Object object) {
        return ReflectionToStringBuilder.reflectionToString(object, new FilteredRecursiveToStringStyle());
    }

    static String reflectionString(Object object, ToStringStyle toStringStyle) {
        return ReflectionToStringBuilder.reflectionToString(object, toStringStyle);
    }
}
