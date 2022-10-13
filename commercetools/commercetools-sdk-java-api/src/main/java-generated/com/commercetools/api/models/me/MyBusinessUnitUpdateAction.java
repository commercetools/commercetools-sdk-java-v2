
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.commercetools.api.models.business_unit.MyBusinessUnitChangeAssociateAction;
import com.commercetools.api.models.business_unit.MyBusinessUnitChangeNameAction;
import com.commercetools.api.models.business_unit.MyBusinessUnitChangeParentUnitAction;
import com.commercetools.api.models.business_unit.MyBusinessUnitSetDefaultBillingAddressAction;
import com.commercetools.api.models.business_unit.MyBusinessUnitSetDefaultShippingAddressAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyBusinessUnitUpdateAction
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyBusinessUnitUpdateAction myBusinessUnitUpdateAction = MyBusinessUnitUpdateAction.addAddressBuilder()
 *             address(addressBuilder -> addressBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyBusinessUnitAddAddressActionImpl.class, name = MyBusinessUnitAddAddressAction.ADD_ADDRESS),
        @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyBusinessUnitAddBillingAddressIdActionImpl.class, name = MyBusinessUnitAddBillingAddressIdAction.ADD_BILLING_ADDRESS_ID),
        @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyBusinessUnitAddShippingAddressIdActionImpl.class, name = MyBusinessUnitAddShippingAddressIdAction.ADD_SHIPPING_ADDRESS_ID),
        @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyBusinessUnitChangeAddressActionImpl.class, name = MyBusinessUnitChangeAddressAction.CHANGE_ADDRESS),
        @JsonSubTypes.Type(value = com.commercetools.api.models.business_unit.MyBusinessUnitChangeAssociateActionImpl.class, name = MyBusinessUnitChangeAssociateAction.CHANGE_ASSOCIATE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.business_unit.MyBusinessUnitChangeNameActionImpl.class, name = MyBusinessUnitChangeNameAction.CHANGE_NAME),
        @JsonSubTypes.Type(value = com.commercetools.api.models.business_unit.MyBusinessUnitChangeParentUnitActionImpl.class, name = MyBusinessUnitChangeParentUnitAction.CHANGE_PARENT_UNIT),
        @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyBusinessUnitRemoveAddressActionImpl.class, name = MyBusinessUnitRemoveAddressAction.REMOVE_ADDRESS),
        @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyBusinessUnitRemoveAssociateActionImpl.class, name = MyBusinessUnitRemoveAssociateAction.REMOVE_ASSOCIATE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyBusinessUnitRemoveBillingAddressIdActionImpl.class, name = MyBusinessUnitRemoveBillingAddressIdAction.REMOVE_BILLING_ADDRESS_ID),
        @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyBusinessUnitRemoveShippingAddressIdActionImpl.class, name = MyBusinessUnitRemoveShippingAddressIdAction.REMOVE_SHIPPING_ADDRESS_ID),
        @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyBusinessUnitSetAddressCustomFieldActionImpl.class, name = MyBusinessUnitSetAddressCustomFieldAction.SET_ADDRESS_CUSTOM_FIELD),
        @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyBusinessUnitSetAddressCustomTypeActionImpl.class, name = MyBusinessUnitSetAddressCustomTypeAction.SET_ADDRESS_CUSTOM_TYPE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyBusinessUnitSetContactEmailActionImpl.class, name = MyBusinessUnitSetContactEmailAction.SET_CONTACT_EMAIL),
        @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyBusinessUnitSetCustomFieldActionImpl.class, name = MyBusinessUnitSetCustomFieldAction.SET_CUSTOM_FIELD),
        @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyBusinessUnitSetCustomTypeActionImpl.class, name = MyBusinessUnitSetCustomTypeAction.SET_CUSTOM_TYPE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.business_unit.MyBusinessUnitSetDefaultBillingAddressActionImpl.class, name = MyBusinessUnitSetDefaultBillingAddressAction.SET_DEFAULT_BILLING_ADDRESS),
        @JsonSubTypes.Type(value = com.commercetools.api.models.business_unit.MyBusinessUnitSetDefaultShippingAddressActionImpl.class, name = MyBusinessUnitSetDefaultShippingAddressAction.SET_DEFAULT_SHIPPING_ADDRESS) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "action", defaultImpl = MyBusinessUnitUpdateActionImpl.class, visible = true)
@JsonDeserialize(as = MyBusinessUnitUpdateActionImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface MyBusinessUnitUpdateAction {

    /**
     *
     */
    @NotNull
    @JsonProperty("action")
    public String getAction();

    public static com.commercetools.api.models.me.MyBusinessUnitAddAddressActionBuilder addAddressBuilder() {
        return com.commercetools.api.models.me.MyBusinessUnitAddAddressActionBuilder.of();
    }

    public static com.commercetools.api.models.me.MyBusinessUnitAddBillingAddressIdActionBuilder addBillingAddressIdBuilder() {
        return com.commercetools.api.models.me.MyBusinessUnitAddBillingAddressIdActionBuilder.of();
    }

    public static com.commercetools.api.models.me.MyBusinessUnitAddShippingAddressIdActionBuilder addShippingAddressIdBuilder() {
        return com.commercetools.api.models.me.MyBusinessUnitAddShippingAddressIdActionBuilder.of();
    }

    public static com.commercetools.api.models.me.MyBusinessUnitChangeAddressActionBuilder changeAddressBuilder() {
        return com.commercetools.api.models.me.MyBusinessUnitChangeAddressActionBuilder.of();
    }

    public static com.commercetools.api.models.business_unit.MyBusinessUnitChangeAssociateActionBuilder changeAssociateBuilder() {
        return com.commercetools.api.models.business_unit.MyBusinessUnitChangeAssociateActionBuilder.of();
    }

    public static com.commercetools.api.models.business_unit.MyBusinessUnitChangeNameActionBuilder changeNameBuilder() {
        return com.commercetools.api.models.business_unit.MyBusinessUnitChangeNameActionBuilder.of();
    }

    public static com.commercetools.api.models.business_unit.MyBusinessUnitChangeParentUnitActionBuilder changeParentUnitBuilder() {
        return com.commercetools.api.models.business_unit.MyBusinessUnitChangeParentUnitActionBuilder.of();
    }

    public static com.commercetools.api.models.me.MyBusinessUnitRemoveAddressActionBuilder removeAddressBuilder() {
        return com.commercetools.api.models.me.MyBusinessUnitRemoveAddressActionBuilder.of();
    }

    public static com.commercetools.api.models.me.MyBusinessUnitRemoveAssociateActionBuilder removeAssociateBuilder() {
        return com.commercetools.api.models.me.MyBusinessUnitRemoveAssociateActionBuilder.of();
    }

    public static com.commercetools.api.models.me.MyBusinessUnitRemoveBillingAddressIdActionBuilder removeBillingAddressIdBuilder() {
        return com.commercetools.api.models.me.MyBusinessUnitRemoveBillingAddressIdActionBuilder.of();
    }

    public static com.commercetools.api.models.me.MyBusinessUnitRemoveShippingAddressIdActionBuilder removeShippingAddressIdBuilder() {
        return com.commercetools.api.models.me.MyBusinessUnitRemoveShippingAddressIdActionBuilder.of();
    }

    public static com.commercetools.api.models.me.MyBusinessUnitSetAddressCustomFieldActionBuilder setAddressCustomFieldBuilder() {
        return com.commercetools.api.models.me.MyBusinessUnitSetAddressCustomFieldActionBuilder.of();
    }

    public static com.commercetools.api.models.me.MyBusinessUnitSetAddressCustomTypeActionBuilder setAddressCustomTypeBuilder() {
        return com.commercetools.api.models.me.MyBusinessUnitSetAddressCustomTypeActionBuilder.of();
    }

    public static com.commercetools.api.models.me.MyBusinessUnitSetContactEmailActionBuilder setContactEmailBuilder() {
        return com.commercetools.api.models.me.MyBusinessUnitSetContactEmailActionBuilder.of();
    }

    public static com.commercetools.api.models.me.MyBusinessUnitSetCustomFieldActionBuilder setCustomFieldBuilder() {
        return com.commercetools.api.models.me.MyBusinessUnitSetCustomFieldActionBuilder.of();
    }

    public static com.commercetools.api.models.me.MyBusinessUnitSetCustomTypeActionBuilder setCustomTypeBuilder() {
        return com.commercetools.api.models.me.MyBusinessUnitSetCustomTypeActionBuilder.of();
    }

    public static com.commercetools.api.models.business_unit.MyBusinessUnitSetDefaultBillingAddressActionBuilder setDefaultBillingAddressBuilder() {
        return com.commercetools.api.models.business_unit.MyBusinessUnitSetDefaultBillingAddressActionBuilder.of();
    }

    public static com.commercetools.api.models.business_unit.MyBusinessUnitSetDefaultShippingAddressActionBuilder setDefaultShippingAddressBuilder() {
        return com.commercetools.api.models.business_unit.MyBusinessUnitSetDefaultShippingAddressActionBuilder.of();
    }

    default <T> T withMyBusinessUnitUpdateAction(Function<MyBusinessUnitUpdateAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<MyBusinessUnitUpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyBusinessUnitUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyBusinessUnitUpdateAction>";
            }
        };
    }
}
