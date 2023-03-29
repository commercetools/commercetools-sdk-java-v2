
package com.commercetools.api.models.business_unit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Adding an Associate to a Business Unit generates a BusinessUnitAssociateAdded Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitAddAssociateAction businessUnitAddAssociateAction = BusinessUnitAddAssociateAction.builder()
 *             .associate(associateBuilder -> associateBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitAddAssociateActionImpl.class)
public interface BusinessUnitAddAssociateAction extends BusinessUnitUpdateAction {

    /**
     * discriminator value for BusinessUnitAddAssociateAction
     */
    String ADD_ASSOCIATE = "addAssociate";

    /**
     *  <p>The Associate to add.</p>
     * @return associate
     */
    @NotNull
    @Valid
    @JsonProperty("associate")
    public AssociateDraft getAssociate();

    /**
     *  <p>The Associate to add.</p>
     * @param associate value to be set
     */

    public void setAssociate(final AssociateDraft associate);

    /**
     * factory method
     * @return instance of BusinessUnitAddAssociateAction
     */
    public static BusinessUnitAddAssociateAction of() {
        return new BusinessUnitAddAssociateActionImpl();
    }

    /**
     * factory method to create a shallow copy BusinessUnitAddAssociateAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static BusinessUnitAddAssociateAction of(final BusinessUnitAddAssociateAction template) {
        BusinessUnitAddAssociateActionImpl instance = new BusinessUnitAddAssociateActionImpl();
        instance.setAssociate(template.getAssociate());
        return instance;
    }

    /**
     * factory method to create a deep copy of BusinessUnitAddAssociateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static BusinessUnitAddAssociateAction deepCopy(@Nullable final BusinessUnitAddAssociateAction template) {
        if (template == null) {
            return null;
        }
        BusinessUnitAddAssociateActionImpl instance = new BusinessUnitAddAssociateActionImpl();
        instance.setAssociate(
            com.commercetools.api.models.business_unit.AssociateDraft.deepCopy(template.getAssociate()));
        return instance;
    }

    /**
     * builder factory method for BusinessUnitAddAssociateAction
     * @return builder
     */
    public static BusinessUnitAddAssociateActionBuilder builder() {
        return BusinessUnitAddAssociateActionBuilder.of();
    }

    /**
     * create builder for BusinessUnitAddAssociateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitAddAssociateActionBuilder builder(final BusinessUnitAddAssociateAction template) {
        return BusinessUnitAddAssociateActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnitAddAssociateAction(Function<BusinessUnitAddAssociateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitAddAssociateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitAddAssociateAction>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitAddAssociateAction>";
            }
        };
    }
}
