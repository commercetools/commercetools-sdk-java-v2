
package com.commercetools.checkout.models.recurring_payment;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.checkout.models.common.Reference;
import com.commercetools.checkout.models.common.ReferenceTypeId;
import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;
import tools.jackson.databind.annotation.*;

/**
 *  <p>Reference to a <a href="https://docs.commercetools.com/apis/ctp:checkout:type:RecurringPayment" rel="nofollow">RecurringPayment</a>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurringPaymentReference recurringPaymentReference = RecurringPaymentReference.builder()
 *             .id("{id}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("recurring-payment")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = RecurringPaymentReferenceImpl.class)
public interface RecurringPaymentReference extends Reference {

    /**
     * discriminator value for RecurringPaymentReference
     */
    String RECURRING_PAYMENT = "recurring-payment";

    /**
     *
     * @return typeId
     */
    @NotNull
    @JsonProperty("typeId")
    public ReferenceTypeId getTypeId();

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:checkout:type:RecurringPayment" rel="nofollow">RecurringPayment</a>.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:checkout:type:RecurringPayment" rel="nofollow">RecurringPayment</a>.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     * factory method
     * @return instance of RecurringPaymentReference
     */
    public static RecurringPaymentReference of() {
        return new RecurringPaymentReferenceImpl();
    }

    /**
     * factory method to create a shallow copy RecurringPaymentReference
     * @param template instance to be copied
     * @return copy instance
     */
    public static RecurringPaymentReference of(final RecurringPaymentReference template) {
        RecurringPaymentReferenceImpl instance = new RecurringPaymentReferenceImpl();
        instance.setId(template.getId());
        return instance;
    }

    public RecurringPaymentReference copyDeep();

    /**
     * factory method to create a deep copy of RecurringPaymentReference
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RecurringPaymentReference deepCopy(@Nullable final RecurringPaymentReference template) {
        if (template == null) {
            return null;
        }
        RecurringPaymentReferenceImpl instance = new RecurringPaymentReferenceImpl();
        instance.setId(template.getId());
        return instance;
    }

    /**
     * builder factory method for RecurringPaymentReference
     * @return builder
     */
    public static RecurringPaymentReferenceBuilder builder() {
        return RecurringPaymentReferenceBuilder.of();
    }

    /**
     * create builder for RecurringPaymentReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurringPaymentReferenceBuilder builder(final RecurringPaymentReference template) {
        return RecurringPaymentReferenceBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRecurringPaymentReference(Function<RecurringPaymentReference, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<RecurringPaymentReference> typeReference() {
        return new tools.jackson.core.type.TypeReference<RecurringPaymentReference>() {
            @Override
            public String toString() {
                return "TypeReference<RecurringPaymentReference>";
            }
        };
    }
}
