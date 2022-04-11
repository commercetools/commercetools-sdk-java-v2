
package com.commercetools.api.models.customer_group;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class CustomerGroupUpdateActionBuilder {

    public com.commercetools.api.models.customer_group.CustomerGroupChangeNameActionBuilder changeNameBuilder() {
        return com.commercetools.api.models.customer_group.CustomerGroupChangeNameActionBuilder.of();
    }

    public com.commercetools.api.models.customer_group.CustomerGroupSetCustomFieldActionBuilder setCustomFieldBuilder() {
        return com.commercetools.api.models.customer_group.CustomerGroupSetCustomFieldActionBuilder.of();
    }

    public com.commercetools.api.models.customer_group.CustomerGroupSetCustomTypeActionBuilder setCustomTypeBuilder() {
        return com.commercetools.api.models.customer_group.CustomerGroupSetCustomTypeActionBuilder.of();
    }

    public com.commercetools.api.models.customer_group.CustomerGroupSetKeyActionBuilder setKeyBuilder() {
        return com.commercetools.api.models.customer_group.CustomerGroupSetKeyActionBuilder.of();
    }

    public static CustomerGroupUpdateActionBuilder of() {
        return new CustomerGroupUpdateActionBuilder();
    }
}
