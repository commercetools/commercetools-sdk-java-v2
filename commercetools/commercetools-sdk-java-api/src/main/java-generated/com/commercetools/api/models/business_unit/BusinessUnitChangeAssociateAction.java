
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
 *  <p>Updating the Associate on a Business Unit generates the BusinessUnitAssociateChanged Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitChangeAssociateAction businessUnitChangeAssociateAction = BusinessUnitChangeAssociateAction.builder()
 *             .associate(associateBuilder -> associateBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitChangeAssociateActionImpl.class)
public interface BusinessUnitChangeAssociateAction extends BusinessUnitUpdateAction {

    /**
     * discriminator value for BusinessUnitChangeAssociateAction
     */
    String CHANGE_ASSOCIATE = "changeAssociate";

    /**
     *  <p>New version of an existing Associate.</p>
     * @return associate
     */
    @NotNull
    @Valid
    @JsonProperty("associate")
    public AssociateDraft getAssociate();

    /**
     *  <p>New version of an existing Associate.</p>
     * @param associate value to be set
     */

    public void setAssociate(final AssociateDraft associate);

    /**
     * factory method
     * @return instance of BusinessUnitChangeAssociateAction
     */
    public static BusinessUnitChangeAssociateAction of() {
        return new BusinessUnitChangeAssociateActionImpl();
    }

    /**
     * factory method to create a shallow copy BusinessUnitChangeAssociateAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static BusinessUnitChangeAssociateAction of(final BusinessUnitChangeAssociateAction template) {
        BusinessUnitChangeAssociateActionImpl instance = new BusinessUnitChangeAssociateActionImpl();
        instance.setAssociate(template.getAssociate());
        return instance;
    }

    /**
     * factory method to create a deep copy of BusinessUnitChangeAssociateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static BusinessUnitChangeAssociateAction deepCopy(
            @Nullable final BusinessUnitChangeAssociateAction template) {
        if (template == null) {
            return null;
        }
        BusinessUnitChangeAssociateActionImpl instance = new BusinessUnitChangeAssociateActionImpl();
        instance.setAssociate(
            com.commercetools.api.models.business_unit.AssociateDraft.deepCopy(template.getAssociate()));
        return instance;
    }

    /**
     * builder factory method for BusinessUnitChangeAssociateAction
     * @return builder
     */
    public static BusinessUnitChangeAssociateActionBuilder builder() {
        return BusinessUnitChangeAssociateActionBuilder.of();
    }

    /**
     * create builder for BusinessUnitChangeAssociateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitChangeAssociateActionBuilder builder(final BusinessUnitChangeAssociateAction template) {
        return BusinessUnitChangeAssociateActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnitChangeAssociateAction(Function<BusinessUnitChangeAssociateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitChangeAssociateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitChangeAssociateAction>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitChangeAssociateAction>";
            }
        };
    }
}
