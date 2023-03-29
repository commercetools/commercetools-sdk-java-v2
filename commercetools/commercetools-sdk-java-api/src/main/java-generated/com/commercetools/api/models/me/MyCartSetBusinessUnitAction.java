
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Updates the Business Unit on the Cart. The Cart must have an existing Business Unit assigned already.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCartSetBusinessUnitAction myCartSetBusinessUnitAction = MyCartSetBusinessUnitAction.builder()
 *             .businessUnit(businessUnitBuilder -> businessUnitBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyCartSetBusinessUnitActionImpl.class)
public interface MyCartSetBusinessUnitAction extends MyCartUpdateAction {

    /**
     * discriminator value for MyCartSetBusinessUnitAction
     */
    String SET_BUSINESS_UNIT = "setBusinessUnit";

    /**
     *  <p>New Business Unit to assign to the Cart, which must have access to the Store that is set on the Cart. Additionally, the authenticated user must have Buyer access to the Business Unit.</p>
     * @return businessUnit
     */
    @NotNull
    @Valid
    @JsonProperty("businessUnit")
    public BusinessUnitResourceIdentifier getBusinessUnit();

    /**
     *  <p>New Business Unit to assign to the Cart, which must have access to the Store that is set on the Cart. Additionally, the authenticated user must have Buyer access to the Business Unit.</p>
     * @param businessUnit value to be set
     */

    public void setBusinessUnit(final BusinessUnitResourceIdentifier businessUnit);

    /**
     * factory method
     * @return instance of MyCartSetBusinessUnitAction
     */
    public static MyCartSetBusinessUnitAction of() {
        return new MyCartSetBusinessUnitActionImpl();
    }

    /**
     * factory method to create a shallow copy MyCartSetBusinessUnitAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static MyCartSetBusinessUnitAction of(final MyCartSetBusinessUnitAction template) {
        MyCartSetBusinessUnitActionImpl instance = new MyCartSetBusinessUnitActionImpl();
        instance.setBusinessUnit(template.getBusinessUnit());
        return instance;
    }

    /**
     * factory method to create a deep copy of MyCartSetBusinessUnitAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MyCartSetBusinessUnitAction deepCopy(@Nullable final MyCartSetBusinessUnitAction template) {
        if (template == null) {
            return null;
        }
        MyCartSetBusinessUnitActionImpl instance = new MyCartSetBusinessUnitActionImpl();
        instance.setBusinessUnit(com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier
                .deepCopy(template.getBusinessUnit()));
        return instance;
    }

    /**
     * builder factory method for MyCartSetBusinessUnitAction
     * @return builder
     */
    public static MyCartSetBusinessUnitActionBuilder builder() {
        return MyCartSetBusinessUnitActionBuilder.of();
    }

    /**
     * create builder for MyCartSetBusinessUnitAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyCartSetBusinessUnitActionBuilder builder(final MyCartSetBusinessUnitAction template) {
        return MyCartSetBusinessUnitActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyCartSetBusinessUnitAction(Function<MyCartSetBusinessUnitAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyCartSetBusinessUnitAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyCartSetBusinessUnitAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyCartSetBusinessUnitAction>";
            }
        };
    }
}
