
package com.commercetools.api.models.me;

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
 *     MyCartSetBusinessUnitAction myCartSetBusinessUnitAction = MyCartSetBusinessUnitAction.builder()
 *             .businessUnit(businessUnitBuilder -> businessUnitBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyCartSetBusinessUnitActionImpl.class)
public interface MyCartSetBusinessUnitAction extends MyCartUpdateAction {

    String SET_BUSINESS_UNIT = "setBusinessUnit";

    /**
     *  <p>New Business Unit to assign to the Cart, which must have access to the Store that is set on the Cart. Additionally, the authenticated user must have Buyer access to the Business Unit.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("businessUnit")
    public BusinessUnitResourceIdentifier getBusinessUnit();

    public void setBusinessUnit(final BusinessUnitResourceIdentifier businessUnit);

    public static MyCartSetBusinessUnitAction of() {
        return new MyCartSetBusinessUnitActionImpl();
    }

    public static MyCartSetBusinessUnitAction of(final MyCartSetBusinessUnitAction template) {
        MyCartSetBusinessUnitActionImpl instance = new MyCartSetBusinessUnitActionImpl();
        instance.setBusinessUnit(template.getBusinessUnit());
        return instance;
    }

    public static MyCartSetBusinessUnitActionBuilder builder() {
        return MyCartSetBusinessUnitActionBuilder.of();
    }

    public static MyCartSetBusinessUnitActionBuilder builder(final MyCartSetBusinessUnitAction template) {
        return MyCartSetBusinessUnitActionBuilder.of(template);
    }

    default <T> T withMyCartSetBusinessUnitAction(Function<MyCartSetBusinessUnitAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<MyCartSetBusinessUnitAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyCartSetBusinessUnitAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyCartSetBusinessUnitAction>";
            }
        };
    }
}
