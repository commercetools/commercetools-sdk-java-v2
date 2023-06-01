package com.commercetools.api.models.customer_group;

import com.commercetools.api.models.customer_group.CustomerGroupChangeNameAction;
import com.commercetools.api.models.customer_group.CustomerGroupSetCustomFieldAction;
import com.commercetools.api.models.customer_group.CustomerGroupSetCustomTypeAction;
import com.commercetools.api.models.customer_group.CustomerGroupSetKeyAction;
import com.commercetools.api.models.customer_group.CustomerGroupUpdateAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerGroupUpdateActionBuilder
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
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

    /**
     * factory method for an instance of CustomerGroupUpdateActionBuilder
     * @return builder 
     */
    public static CustomerGroupUpdateActionBuilder of() {
        return new CustomerGroupUpdateActionBuilder();
    }

}
