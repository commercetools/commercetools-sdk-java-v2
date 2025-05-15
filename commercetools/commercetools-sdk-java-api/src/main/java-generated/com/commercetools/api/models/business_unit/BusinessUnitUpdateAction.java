
package com.commercetools.api.models.business_unit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * BusinessUnitUpdateAction
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitUpdateAction businessUnitUpdateAction = BusinessUnitUpdateAction.addAddressBuilder()
 *             address(addressBuilder -> addressBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "action", defaultImpl = BusinessUnitUpdateActionImpl.class, visible = true)
@JsonDeserialize(as = BusinessUnitUpdateActionImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface BusinessUnitUpdateAction
        extends com.commercetools.api.models.ResourceUpdateAction<BusinessUnitUpdateAction> {

    /**
     *
     * @return action
     */
    @NotNull
    @JsonProperty("action")
    public String getAction();

    public BusinessUnitUpdateAction copyDeep();

    /**
     * factory method to create a deep copy of BusinessUnitUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static BusinessUnitUpdateAction deepCopy(@Nullable final BusinessUnitUpdateAction template) {
        if (template == null) {
            return null;
        }

        if (!(template instanceof BusinessUnitUpdateActionImpl)) {
            return template.copyDeep();
        }
        BusinessUnitUpdateActionImpl instance = new BusinessUnitUpdateActionImpl();
        return instance;
    }

    /**
     * builder for addAddress subtype
     * @return builder
     */
    public static com.commercetools.api.models.business_unit.BusinessUnitAddAddressActionBuilder addAddressBuilder() {
        return com.commercetools.api.models.business_unit.BusinessUnitAddAddressActionBuilder.of();
    }

    /**
     * builder for addAssociate subtype
     * @return builder
     */
    public static com.commercetools.api.models.business_unit.BusinessUnitAddAssociateActionBuilder addAssociateBuilder() {
        return com.commercetools.api.models.business_unit.BusinessUnitAddAssociateActionBuilder.of();
    }

    /**
     * builder for addBillingAddressId subtype
     * @return builder
     */
    public static com.commercetools.api.models.business_unit.BusinessUnitAddBillingAddressIdActionBuilder addBillingAddressIdBuilder() {
        return com.commercetools.api.models.business_unit.BusinessUnitAddBillingAddressIdActionBuilder.of();
    }

    /**
     * builder for addShippingAddressId subtype
     * @return builder
     */
    public static com.commercetools.api.models.business_unit.BusinessUnitAddShippingAddressIdActionBuilder addShippingAddressIdBuilder() {
        return com.commercetools.api.models.business_unit.BusinessUnitAddShippingAddressIdActionBuilder.of();
    }

    /**
     * builder for addStore subtype
     * @return builder
     */
    public static com.commercetools.api.models.business_unit.BusinessUnitAddStoreActionBuilder addStoreBuilder() {
        return com.commercetools.api.models.business_unit.BusinessUnitAddStoreActionBuilder.of();
    }

    /**
     * builder for changeAddress subtype
     * @return builder
     */
    public static com.commercetools.api.models.business_unit.BusinessUnitChangeAddressActionBuilder changeAddressBuilder() {
        return com.commercetools.api.models.business_unit.BusinessUnitChangeAddressActionBuilder.of();
    }

    /**
     * builder for changeApprovalRuleMode subtype
     * @return builder
     */
    public static com.commercetools.api.models.business_unit.BusinessUnitChangeApprovalRuleModeActionBuilder changeApprovalRuleModeBuilder() {
        return com.commercetools.api.models.business_unit.BusinessUnitChangeApprovalRuleModeActionBuilder.of();
    }

    /**
     * builder for changeAssociate subtype
     * @return builder
     */
    public static com.commercetools.api.models.business_unit.BusinessUnitChangeAssociateActionBuilder changeAssociateBuilder() {
        return com.commercetools.api.models.business_unit.BusinessUnitChangeAssociateActionBuilder.of();
    }

    /**
     * builder for changeAssociateMode subtype
     * @return builder
     */
    public static com.commercetools.api.models.business_unit.BusinessUnitChangeAssociateModeActionBuilder changeAssociateModeBuilder() {
        return com.commercetools.api.models.business_unit.BusinessUnitChangeAssociateModeActionBuilder.of();
    }

    /**
     * builder for changeName subtype
     * @return builder
     */
    public static com.commercetools.api.models.business_unit.BusinessUnitChangeNameActionBuilder changeNameBuilder() {
        return com.commercetools.api.models.business_unit.BusinessUnitChangeNameActionBuilder.of();
    }

    /**
     * builder for changeParentUnit subtype
     * @return builder
     */
    public static com.commercetools.api.models.business_unit.BusinessUnitChangeParentUnitActionBuilder changeParentUnitBuilder() {
        return com.commercetools.api.models.business_unit.BusinessUnitChangeParentUnitActionBuilder.of();
    }

    /**
     * builder for changeStatus subtype
     * @return builder
     */
    public static com.commercetools.api.models.business_unit.BusinessUnitChangeStatusActionBuilder changeStatusBuilder() {
        return com.commercetools.api.models.business_unit.BusinessUnitChangeStatusActionBuilder.of();
    }

    /**
     * builder for removeAddress subtype
     * @return builder
     */
    public static com.commercetools.api.models.business_unit.BusinessUnitRemoveAddressActionBuilder removeAddressBuilder() {
        return com.commercetools.api.models.business_unit.BusinessUnitRemoveAddressActionBuilder.of();
    }

    /**
     * builder for removeAssociate subtype
     * @return builder
     */
    public static com.commercetools.api.models.business_unit.BusinessUnitRemoveAssociateActionBuilder removeAssociateBuilder() {
        return com.commercetools.api.models.business_unit.BusinessUnitRemoveAssociateActionBuilder.of();
    }

    /**
     * builder for removeBillingAddressId subtype
     * @return builder
     */
    public static com.commercetools.api.models.business_unit.BusinessUnitRemoveBillingAddressIdActionBuilder removeBillingAddressIdBuilder() {
        return com.commercetools.api.models.business_unit.BusinessUnitRemoveBillingAddressIdActionBuilder.of();
    }

    /**
     * builder for removeShippingAddressId subtype
     * @return builder
     */
    public static com.commercetools.api.models.business_unit.BusinessUnitRemoveShippingAddressIdActionBuilder removeShippingAddressIdBuilder() {
        return com.commercetools.api.models.business_unit.BusinessUnitRemoveShippingAddressIdActionBuilder.of();
    }

    /**
     * builder for removeStore subtype
     * @return builder
     */
    public static com.commercetools.api.models.business_unit.BusinessUnitRemoveStoreActionBuilder removeStoreBuilder() {
        return com.commercetools.api.models.business_unit.BusinessUnitRemoveStoreActionBuilder.of();
    }

    /**
     * builder for setAddressCustomField subtype
     * @return builder
     */
    public static com.commercetools.api.models.business_unit.BusinessUnitSetAddressCustomFieldActionBuilder setAddressCustomFieldBuilder() {
        return com.commercetools.api.models.business_unit.BusinessUnitSetAddressCustomFieldActionBuilder.of();
    }

    /**
     * builder for setAddressCustomType subtype
     * @return builder
     */
    public static com.commercetools.api.models.business_unit.BusinessUnitSetAddressCustomTypeActionBuilder setAddressCustomTypeBuilder() {
        return com.commercetools.api.models.business_unit.BusinessUnitSetAddressCustomTypeActionBuilder.of();
    }

    /**
     * builder for setAssociates subtype
     * @return builder
     */
    public static com.commercetools.api.models.business_unit.BusinessUnitSetAssociatesActionBuilder setAssociatesBuilder() {
        return com.commercetools.api.models.business_unit.BusinessUnitSetAssociatesActionBuilder.of();
    }

    /**
     * builder for setContactEmail subtype
     * @return builder
     */
    public static com.commercetools.api.models.business_unit.BusinessUnitSetContactEmailActionBuilder setContactEmailBuilder() {
        return com.commercetools.api.models.business_unit.BusinessUnitSetContactEmailActionBuilder.of();
    }

    /**
     * builder for setCustomField subtype
     * @return builder
     */
    public static com.commercetools.api.models.business_unit.BusinessUnitSetCustomFieldActionBuilder setCustomFieldBuilder() {
        return com.commercetools.api.models.business_unit.BusinessUnitSetCustomFieldActionBuilder.of();
    }

    /**
     * builder for setCustomType subtype
     * @return builder
     */
    public static com.commercetools.api.models.business_unit.BusinessUnitSetCustomTypeActionBuilder setCustomTypeBuilder() {
        return com.commercetools.api.models.business_unit.BusinessUnitSetCustomTypeActionBuilder.of();
    }

    /**
     * builder for setDefaultBillingAddress subtype
     * @return builder
     */
    public static com.commercetools.api.models.business_unit.BusinessUnitSetDefaultBillingAddressActionBuilder setDefaultBillingAddressBuilder() {
        return com.commercetools.api.models.business_unit.BusinessUnitSetDefaultBillingAddressActionBuilder.of();
    }

    /**
     * builder for setDefaultShippingAddress subtype
     * @return builder
     */
    public static com.commercetools.api.models.business_unit.BusinessUnitSetDefaultShippingAddressActionBuilder setDefaultShippingAddressBuilder() {
        return com.commercetools.api.models.business_unit.BusinessUnitSetDefaultShippingAddressActionBuilder.of();
    }

    /**
     * builder for setStoreMode subtype
     * @return builder
     */
    public static com.commercetools.api.models.business_unit.BusinessUnitSetStoreModeActionBuilder setStoreModeBuilder() {
        return com.commercetools.api.models.business_unit.BusinessUnitSetStoreModeActionBuilder.of();
    }

    /**
     * builder for setStores subtype
     * @return builder
     */
    public static com.commercetools.api.models.business_unit.BusinessUnitSetStoresActionBuilder setStoresBuilder() {
        return com.commercetools.api.models.business_unit.BusinessUnitSetStoresActionBuilder.of();
    }

    /**
     * builder for setUnitType subtype
     * @return builder
     */
    public static com.commercetools.api.models.business_unit.BusinessUnitSetUnitTypeActionBuilder setUnitTypeBuilder() {
        return com.commercetools.api.models.business_unit.BusinessUnitSetUnitTypeActionBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnitUpdateAction(Function<BusinessUnitUpdateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitUpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitUpdateAction>";
            }
        };
    }
}
