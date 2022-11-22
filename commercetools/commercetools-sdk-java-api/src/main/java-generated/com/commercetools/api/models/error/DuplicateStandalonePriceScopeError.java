
package com.commercetools.api.models.error;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier;
import com.commercetools.api.models.standalone_price.StandalonePriceReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Returned when the given Price scope conflicts with the Price scope of an existing Standalone Price. Every Standalone Price associated with the same SKU must have a distinct combination of currency, country, Customer Group, Channel, and validity periods (<code>validFrom</code> and <code>validUntil</code>).</p>
 *  <p>The error is returned as a failed response to the Create StandalonePrice request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DuplicateStandalonePriceScopeError duplicateStandalonePriceScopeError = DuplicateStandalonePriceScopeError.builder()
 *             .message("{message}")
 *             .conflictingStandalonePrice(conflictingStandalonePriceBuilder -> conflictingStandalonePriceBuilder)
 *             .sku("{sku}")
 *             .currency("{currency}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DuplicateStandalonePriceScopeErrorImpl.class)
public interface DuplicateStandalonePriceScopeError extends ErrorObject {

    String DUPLICATE_STANDALONE_PRICE_SCOPE = "DuplicateStandalonePriceScope";

    /**
     *
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p><code>"Duplicate standalone price scope for SKU: $sku. The combination of SKU, currency, country, customerGroup, channel, validFrom and validUntil must be unique for each standalone price."</code></p>
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p>Reference to the conflicting Standalone Price.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("conflictingStandalonePrice")
    public StandalonePriceReference getConflictingStandalonePrice();

    /**
     *  <p>SKU of the ProductVariant to which the conflicting Standalone Price is associated.</p>
     */
    @NotNull
    @JsonProperty("sku")
    public String getSku();

    /**
     *  <p>Currency code of the country.</p>
     */
    @NotNull
    @JsonProperty("currency")
    public String getCurrency();

    /**
     *  <p>Country code of the geographic location.</p>
     */

    @JsonProperty("country")
    public String getCountry();

    /**
     *  <p>CustomerGroup for which the Standalone Price is valid.</p>
     */
    @Valid
    @JsonProperty("customerGroup")
    public CustomerGroupResourceIdentifier getCustomerGroup();

    /**
     *  <p>Channel for which the Standalone Price is valid.</p>
     */
    @Valid
    @JsonProperty("channel")
    public ChannelResourceIdentifier getChannel();

    /**
     *  <p>Date and time (UTC) from which the Standalone Price is valid.</p>
     */

    @JsonProperty("validFrom")
    public ZonedDateTime getValidFrom();

    /**
     *  <p>Date and time (UTC) until which the Standalone Price is valid.</p>
     */

    @JsonProperty("validUntil")
    public ZonedDateTime getValidUntil();

    public void setMessage(final String message);

    public void setConflictingStandalonePrice(final StandalonePriceReference conflictingStandalonePrice);

    public void setSku(final String sku);

    public void setCurrency(final String currency);

    public void setCountry(final String country);

    public void setCustomerGroup(final CustomerGroupResourceIdentifier customerGroup);

    public void setChannel(final ChannelResourceIdentifier channel);

    public void setValidFrom(final ZonedDateTime validFrom);

    public void setValidUntil(final ZonedDateTime validUntil);

    public static DuplicateStandalonePriceScopeError of() {
        return new DuplicateStandalonePriceScopeErrorImpl();
    }

    public static DuplicateStandalonePriceScopeError of(final DuplicateStandalonePriceScopeError template) {
        DuplicateStandalonePriceScopeErrorImpl instance = new DuplicateStandalonePriceScopeErrorImpl();
        instance.setMessage(template.getMessage());

        instance.setConflictingStandalonePrice(template.getConflictingStandalonePrice());
        instance.setSku(template.getSku());
        instance.setCurrency(template.getCurrency());
        instance.setCountry(template.getCountry());
        instance.setCustomerGroup(template.getCustomerGroup());
        instance.setChannel(template.getChannel());
        instance.setValidFrom(template.getValidFrom());
        instance.setValidUntil(template.getValidUntil());
        return instance;
    }

    public static DuplicateStandalonePriceScopeErrorBuilder builder() {
        return DuplicateStandalonePriceScopeErrorBuilder.of();
    }

    public static DuplicateStandalonePriceScopeErrorBuilder builder(final DuplicateStandalonePriceScopeError template) {
        return DuplicateStandalonePriceScopeErrorBuilder.of(template);
    }

    default <T> T withDuplicateStandalonePriceScopeError(Function<DuplicateStandalonePriceScopeError, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<DuplicateStandalonePriceScopeError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DuplicateStandalonePriceScopeError>() {
            @Override
            public String toString() {
                return "TypeReference<DuplicateStandalonePriceScopeError>";
            }
        };
    }
}
