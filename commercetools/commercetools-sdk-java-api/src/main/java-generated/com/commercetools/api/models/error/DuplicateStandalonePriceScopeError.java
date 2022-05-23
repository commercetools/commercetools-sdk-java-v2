
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
 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   DuplicateStandalonePriceScopeError duplicateStandalonePriceScopeError = DuplicateStandalonePriceScopeError.builder()
           .message("{message}")
           .conflictingStandalonePrice(conflictingStandalonePriceBuilder -> conflictingStandalonePriceBuilder)
           .sku("{sku}")
           .currency("{currency}")
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DuplicateStandalonePriceScopeErrorImpl.class)
public interface DuplicateStandalonePriceScopeError extends ErrorObject {

    String DUPLICATE_STANDALONE_PRICE_SCOPE = "DuplicateStandalonePriceScope";

    /**
     *  <p>Reference to a StandalonePrice.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("conflictingStandalonePrice")
    public StandalonePriceReference getConflictingStandalonePrice();

    @NotNull
    @JsonProperty("sku")
    public String getSku();

    @NotNull
    @JsonProperty("currency")
    public String getCurrency();

    @JsonProperty("country")
    public String getCountry();

    /**
     *  <p>ResourceIdentifier to a CustomerGroup.</p>
     */
    @Valid
    @JsonProperty("customerGroup")
    public CustomerGroupResourceIdentifier getCustomerGroup();

    /**
     *  <p>ResourceIdentifier to a Channel.</p>
     */
    @Valid
    @JsonProperty("channel")
    public ChannelResourceIdentifier getChannel();

    @JsonProperty("validFrom")
    public ZonedDateTime getValidFrom();

    @JsonProperty("validUntil")
    public ZonedDateTime getValidUntil();

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
