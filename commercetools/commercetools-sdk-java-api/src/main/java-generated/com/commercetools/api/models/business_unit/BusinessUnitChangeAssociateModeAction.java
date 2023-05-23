
package com.commercetools.api.models.business_unit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Only Business Units of type <code>Division</code> can be changed to <code>ExplicitAndFromParent</code>. This update action generates a BusinessUnitAssociateModeChanged Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitChangeAssociateModeAction businessUnitChangeAssociateModeAction = BusinessUnitChangeAssociateModeAction.builder()
 *             .associateMode(BusinessUnitAssociateMode.EXPLICIT)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitChangeAssociateModeActionImpl.class)
public interface BusinessUnitChangeAssociateModeAction extends BusinessUnitUpdateAction {

    /**
     * discriminator value for BusinessUnitChangeAssociateModeAction
     */
    String CHANGE_ASSOCIATE_MODE = "changeAssociateMode";

    /**
     *  <p>The new value for <code>associateMode</code>.</p>
     * @return associateMode
     */
    @NotNull
    @JsonProperty("associateMode")
    public BusinessUnitAssociateMode getAssociateMode();

    /**
     *  <p>The new value for <code>associateMode</code>.</p>
     * @param associateMode value to be set
     */

    public void setAssociateMode(final BusinessUnitAssociateMode associateMode);

    /**
     * factory method
     * @return instance of BusinessUnitChangeAssociateModeAction
     */
    public static BusinessUnitChangeAssociateModeAction of() {
        return new BusinessUnitChangeAssociateModeActionImpl();
    }

    /**
     * factory method to create a shallow copy BusinessUnitChangeAssociateModeAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static BusinessUnitChangeAssociateModeAction of(final BusinessUnitChangeAssociateModeAction template) {
        BusinessUnitChangeAssociateModeActionImpl instance = new BusinessUnitChangeAssociateModeActionImpl();
        instance.setAssociateMode(template.getAssociateMode());
        return instance;
    }

    /**
     * factory method to create a deep copy of BusinessUnitChangeAssociateModeAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static BusinessUnitChangeAssociateModeAction deepCopy(
            @Nullable final BusinessUnitChangeAssociateModeAction template) {
        if (template == null) {
            return null;
        }
        BusinessUnitChangeAssociateModeActionImpl instance = new BusinessUnitChangeAssociateModeActionImpl();
        instance.setAssociateMode(template.getAssociateMode());
        return instance;
    }

    /**
     * builder factory method for BusinessUnitChangeAssociateModeAction
     * @return builder
     */
    public static BusinessUnitChangeAssociateModeActionBuilder builder() {
        return BusinessUnitChangeAssociateModeActionBuilder.of();
    }

    /**
     * create builder for BusinessUnitChangeAssociateModeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitChangeAssociateModeActionBuilder builder(
            final BusinessUnitChangeAssociateModeAction template) {
        return BusinessUnitChangeAssociateModeActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnitChangeAssociateModeAction(Function<BusinessUnitChangeAssociateModeAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitChangeAssociateModeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitChangeAssociateModeAction>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitChangeAssociateModeAction>";
            }
        };
    }
}
