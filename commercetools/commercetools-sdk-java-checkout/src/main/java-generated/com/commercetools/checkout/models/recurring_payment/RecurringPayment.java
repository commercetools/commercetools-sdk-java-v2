
package com.commercetools.checkout.models.recurring_payment;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import tools.jackson.databind.annotation.*;

/**
 *  <p>Maps a <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">RecurringOrder</a> to the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethod" rel="nofollow">PaymentMethod</a> and <span>Connector</span> that process its future payments.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurringPayment recurringPayment = RecurringPayment.builder()
 *             .id("{id}")
 *             .version(1)
 *             .recurringOrder(recurringOrderBuilder -> recurringOrderBuilder)
 *             .plusPaymentMethodConfigurations(paymentMethodConfigurationsBuilder -> paymentMethodConfigurationsBuilder)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = RecurringPaymentImpl.class)
public interface RecurringPayment {

    /**
     *  <p>Unique identifier of the RecurringPayment.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Current version of the RecurringPayment.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Integer getVersion();

    /**
     *  <p>User-defined unique identifier of the RecurringPayment.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">RecurringOrder</a> whose future payments are processed using Checkout.</p>
     * @return recurringOrder
     */
    @NotNull
    @Valid
    @JsonProperty("recurringOrder")
    public RecurringOrderReference getRecurringOrder();

    /**
     *  <p>PaymentMethod and Connector used to pay the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">RecurringOrder</a>. Checkout only supports processing this array with one PaymentMethodConfiguration.</p>
     * @return paymentMethodConfigurations
     */
    @NotNull
    @Valid
    @JsonProperty("paymentMethodConfigurations")
    public List<PaymentMethodConfiguration> getPaymentMethodConfigurations();

    /**
     *  <p>Date and time (UTC) the RecurringPayment was initially created.</p>
     * @return createdAt
     */
    @NotNull
    @JsonProperty("createdAt")
    public ZonedDateTime getCreatedAt();

    /**
     *  <p>Date and time (UTC) the RecurringPayment was last updated.</p>
     * @return lastModifiedAt
     */
    @NotNull
    @JsonProperty("lastModifiedAt")
    public ZonedDateTime getLastModifiedAt();

    /**
     *  <p>Unique identifier of the RecurringPayment.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>Current version of the RecurringPayment.</p>
     * @param version value to be set
     */

    public void setVersion(final Integer version);

    /**
     *  <p>User-defined unique identifier of the RecurringPayment.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">RecurringOrder</a> whose future payments are processed using Checkout.</p>
     * @param recurringOrder value to be set
     */

    public void setRecurringOrder(final RecurringOrderReference recurringOrder);

    /**
     *  <p>PaymentMethod and Connector used to pay the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">RecurringOrder</a>. Checkout only supports processing this array with one PaymentMethodConfiguration.</p>
     * @param paymentMethodConfigurations values to be set
     */

    @JsonIgnore
    public void setPaymentMethodConfigurations(final PaymentMethodConfiguration... paymentMethodConfigurations);

    /**
     *  <p>PaymentMethod and Connector used to pay the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">RecurringOrder</a>. Checkout only supports processing this array with one PaymentMethodConfiguration.</p>
     * @param paymentMethodConfigurations values to be set
     */

    public void setPaymentMethodConfigurations(final List<PaymentMethodConfiguration> paymentMethodConfigurations);

    /**
     *  <p>Date and time (UTC) the RecurringPayment was initially created.</p>
     * @param createdAt value to be set
     */

    public void setCreatedAt(final ZonedDateTime createdAt);

    /**
     *  <p>Date and time (UTC) the RecurringPayment was last updated.</p>
     * @param lastModifiedAt value to be set
     */

    public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);

    /**
     * factory method
     * @return instance of RecurringPayment
     */
    public static RecurringPayment of() {
        return new RecurringPaymentImpl();
    }

    /**
     * factory method to create a shallow copy RecurringPayment
     * @param template instance to be copied
     * @return copy instance
     */
    public static RecurringPayment of(final RecurringPayment template) {
        RecurringPaymentImpl instance = new RecurringPaymentImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setKey(template.getKey());
        instance.setRecurringOrder(template.getRecurringOrder());
        instance.setPaymentMethodConfigurations(template.getPaymentMethodConfigurations());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        return instance;
    }

    public RecurringPayment copyDeep();

    /**
     * factory method to create a deep copy of RecurringPayment
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RecurringPayment deepCopy(@Nullable final RecurringPayment template) {
        if (template == null) {
            return null;
        }
        RecurringPaymentImpl instance = new RecurringPaymentImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setKey(template.getKey());
        instance.setRecurringOrder(com.commercetools.checkout.models.recurring_payment.RecurringOrderReference
                .deepCopy(template.getRecurringOrder()));
        instance.setPaymentMethodConfigurations(Optional.ofNullable(template.getPaymentMethodConfigurations())
                .map(t -> t.stream()
                        .map(com.commercetools.checkout.models.recurring_payment.PaymentMethodConfiguration::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        return instance;
    }

    /**
     * builder factory method for RecurringPayment
     * @return builder
     */
    public static RecurringPaymentBuilder builder() {
        return RecurringPaymentBuilder.of();
    }

    /**
     * create builder for RecurringPayment instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurringPaymentBuilder builder(final RecurringPayment template) {
        return RecurringPaymentBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRecurringPayment(Function<RecurringPayment, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<RecurringPayment> typeReference() {
        return new tools.jackson.core.type.TypeReference<RecurringPayment>() {
            @Override
            public String toString() {
                return "TypeReference<RecurringPayment>";
            }
        };
    }
}
