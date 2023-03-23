
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

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
 *     CartSetBusinessUnitAction cartSetBusinessUnitAction = CartSetBusinessUnitAction.builder()
 *             .businessUnit(businessUnitBuilder -> businessUnitBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartSetBusinessUnitActionImpl.class)
public interface CartSetBusinessUnitAction extends CartUpdateAction {

    String SET_BUSINESS_UNIT = "setBusinessUnit";

    /**
     *  <p>New Business Unit to assign to the Cart, which must have access to the Store that is set on the Cart.</p>
     * @return businessUnit
     */
    @NotNull
    @Valid
    @JsonProperty("businessUnit")
    public BusinessUnitResourceIdentifier getBusinessUnit();

    public void setBusinessUnit(final BusinessUnitResourceIdentifier businessUnit);

    public static CartSetBusinessUnitAction of() {
        return new CartSetBusinessUnitActionImpl();
    }

    public static CartSetBusinessUnitAction of(final CartSetBusinessUnitAction template) {
        CartSetBusinessUnitActionImpl instance = new CartSetBusinessUnitActionImpl();
        instance.setBusinessUnit(template.getBusinessUnit());
        return instance;
    }

    public static CartSetBusinessUnitActionBuilder builder() {
        return CartSetBusinessUnitActionBuilder.of();
    }

    public static CartSetBusinessUnitActionBuilder builder(final CartSetBusinessUnitAction template) {
        return CartSetBusinessUnitActionBuilder.of(template);
    }

    default <T> T withCartSetBusinessUnitAction(Function<CartSetBusinessUnitAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CartSetBusinessUnitAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartSetBusinessUnitAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartSetBusinessUnitAction>";
            }
        };
    }
}
