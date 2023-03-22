
package com.commercetools.api.models.me;

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
 *     MyBusinessUnitRemoveAssociateAction myBusinessUnitRemoveAssociateAction = MyBusinessUnitRemoveAssociateAction.builder()
 *             .customer(customerBuilder -> customerBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyBusinessUnitRemoveAssociateActionImpl.class)
public interface MyBusinessUnitRemoveAssociateAction extends MyBusinessUnitUpdateAction {

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

    public static MyBusinessUnitRemoveAssociateAction of() {
        return new MyBusinessUnitRemoveAssociateActionImpl();
    }

    public static MyBusinessUnitRemoveAssociateAction of(final MyBusinessUnitRemoveAssociateAction template) {
        MyBusinessUnitRemoveAssociateActionImpl instance = new MyBusinessUnitRemoveAssociateActionImpl();
        instance.setCustomer(template.getCustomer());
        return instance;
    }

    public static MyBusinessUnitRemoveAssociateActionBuilder builder() {
        return MyBusinessUnitRemoveAssociateActionBuilder.of();
    }

    public static MyBusinessUnitRemoveAssociateActionBuilder builder(
            final MyBusinessUnitRemoveAssociateAction template) {
        return MyBusinessUnitRemoveAssociateActionBuilder.of(template);
    }

    default <T> T withMyBusinessUnitRemoveAssociateAction(Function<MyBusinessUnitRemoveAssociateAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<MyBusinessUnitRemoveAssociateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyBusinessUnitRemoveAssociateAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyBusinessUnitRemoveAssociateAction>";
            }
        };
    }
}
