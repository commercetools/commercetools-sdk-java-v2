
package io.vrap.rmf.base.client;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

abstract class Base {

    @Override
    abstract public boolean equals(final Object o);

    @Override
    abstract public int hashCode();

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    protected boolean reflectionEquals(final Object o) {
        return EqualsBuilder.reflectionEquals(this, o);
    }

    public int reflectionHashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }
}
