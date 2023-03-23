
package com.commercetools.api.models.business_unit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.customer.CustomerResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Removing an Associate from a Business Unit generates a BusinessUnitAssociateRemoved Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitRemoveAssociateAction businessUnitRemoveAssociateAction = BusinessUnitRemoveAssociateAction.builder()
 *             .customer(customerBuilder -> customerBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitRemoveAssociateActionImpl.class)
public interface BusinessUnitRemoveAssociateAction extends BusinessUnitUpdateAction {

    String REMOVE_ASSOCIATE = "removeAssociate";

    /**
     *  <p>Associate to remove.</p>
     * @return customer
     */
    @NotNull
    @Valid
    @JsonProperty("customer")
    public CustomerResourceIdentifier getCustomer();

    public void setCustomer(final CustomerResourceIdentifier customer);

    public static BusinessUnitRemoveAssociateAction of() {
        return new BusinessUnitRemoveAssociateActionImpl();
    }

    public static BusinessUnitRemoveAssociateAction of(final BusinessUnitRemoveAssociateAction template) {
        BusinessUnitRemoveAssociateActionImpl instance = new BusinessUnitRemoveAssociateActionImpl();
        instance.setCustomer(template.getCustomer());
        return instance;
    }

    public static BusinessUnitRemoveAssociateActionBuilder builder() {
        return BusinessUnitRemoveAssociateActionBuilder.of();
    }

    public static BusinessUnitRemoveAssociateActionBuilder builder(final BusinessUnitRemoveAssociateAction template) {
        return BusinessUnitRemoveAssociateActionBuilder.of(template);
    }

    default <T> T withBusinessUnitRemoveAssociateAction(Function<BusinessUnitRemoveAssociateAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitRemoveAssociateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitRemoveAssociateAction>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitRemoveAssociateAction>";
            }
        };
    }
}
