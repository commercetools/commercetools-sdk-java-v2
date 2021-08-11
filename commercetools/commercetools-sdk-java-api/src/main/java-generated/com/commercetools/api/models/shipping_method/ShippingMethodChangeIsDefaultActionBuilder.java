
package com.commercetools.api.models.shipping_method;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ShippingMethodChangeIsDefaultActionBuilder implements Builder<ShippingMethodChangeIsDefaultAction> {

    private Boolean isDefault;

    public ShippingMethodChangeIsDefaultActionBuilder isDefault(final Boolean isDefault) {
        this.isDefault = isDefault;
        return this;
    }

    public Boolean getIsDefault() {
        return this.isDefault;
    }

    public ShippingMethodChangeIsDefaultAction build() {
        Objects.requireNonNull(isDefault, ShippingMethodChangeIsDefaultAction.class + ": isDefault is missing");
        return new ShippingMethodChangeIsDefaultActionImpl(isDefault);
    }

    /**
     * builds ShippingMethodChangeIsDefaultAction without checking for non null required values
     */
    public ShippingMethodChangeIsDefaultAction buildUnchecked() {
        return new ShippingMethodChangeIsDefaultActionImpl(isDefault);
    }

    public static ShippingMethodChangeIsDefaultActionBuilder of() {
        return new ShippingMethodChangeIsDefaultActionBuilder();
    }

    public static ShippingMethodChangeIsDefaultActionBuilder of(final ShippingMethodChangeIsDefaultAction template) {
        ShippingMethodChangeIsDefaultActionBuilder builder = new ShippingMethodChangeIsDefaultActionBuilder();
        builder.isDefault = template.getIsDefault();
        return builder;
    }

}
