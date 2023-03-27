
package com.commercetools.api.models.business_unit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Changes the Associates of a Business Unit, generates a BusinessUnitAssociatesSet Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitSetAssociatesAction businessUnitSetAssociatesAction = BusinessUnitSetAssociatesAction.builder()
 *             .plusAssociates(associatesBuilder -> associatesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitSetAssociatesActionImpl.class)
public interface BusinessUnitSetAssociatesAction extends BusinessUnitUpdateAction {

    /**
     * discriminator value for BusinessUnitSetAssociatesAction
     */
    String SET_ASSOCIATES = "setAssociates";

    /**
     *  <p>The new list of Associates. If not provided, any existing list is removed.</p>
     * @return associates
     */
    @NotNull
    @Valid
    @JsonProperty("associates")
    public List<AssociateDraft> getAssociates();

    /**
     *  <p>The new list of Associates. If not provided, any existing list is removed.</p>
     * @param associates values to be set
     */

    @JsonIgnore
    public void setAssociates(final AssociateDraft... associates);

    /**
     *  <p>The new list of Associates. If not provided, any existing list is removed.</p>
     * @param associates values to be set
     */

    public void setAssociates(final List<AssociateDraft> associates);

    /**
     * factory method
     * @return instance of BusinessUnitSetAssociatesAction
     */
    public static BusinessUnitSetAssociatesAction of() {
        return new BusinessUnitSetAssociatesActionImpl();
    }

    /**
     * factory method to copy an instance of BusinessUnitSetAssociatesAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static BusinessUnitSetAssociatesAction of(final BusinessUnitSetAssociatesAction template) {
        BusinessUnitSetAssociatesActionImpl instance = new BusinessUnitSetAssociatesActionImpl();
        instance.setAssociates(template.getAssociates());
        return instance;
    }

    /**
     * builder factory method for BusinessUnitSetAssociatesAction
     * @return builder
     */
    public static BusinessUnitSetAssociatesActionBuilder builder() {
        return BusinessUnitSetAssociatesActionBuilder.of();
    }

    /**
     * create builder for BusinessUnitSetAssociatesAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitSetAssociatesActionBuilder builder(final BusinessUnitSetAssociatesAction template) {
        return BusinessUnitSetAssociatesActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnitSetAssociatesAction(Function<BusinessUnitSetAssociatesAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitSetAssociatesAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitSetAssociatesAction>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitSetAssociatesAction>";
            }
        };
    }
}
