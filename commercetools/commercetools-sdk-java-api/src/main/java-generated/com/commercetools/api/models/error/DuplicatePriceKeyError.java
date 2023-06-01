package com.commercetools.api.models.error;

import com.commercetools.api.models.common.Price;
import com.commercetools.api.models.error.ErrorObject;
import com.commercetools.api.models.error.DuplicatePriceKeyErrorImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.IOException;

/**
 *  <p>Returned when a Price key conflicts with an existing key.</p>
 *  <p>Keys of Embedded Prices must be unique per ProductVariant.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DuplicatePriceKeyError duplicatePriceKeyError = DuplicatePriceKeyError.builder()
 *             .message("{message}")
 *             .conflictingPrice(conflictingPriceBuilder -> conflictingPriceBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = DuplicatePriceKeyErrorImpl.class)
public interface DuplicatePriceKeyError extends ErrorObject {

    /**
     * discriminator value for DuplicatePriceKeyError
     */
    String DUPLICATE_PRICE_KEY = "DuplicatePriceKey";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();
    /**
     *  <p><code>"Duplicate price key: $priceKey. The price key must be unique per variant."</code></p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();
    /**
     *  <p>Conflicting Embedded Price.</p>
     * @return conflictingPrice
     */
    @NotNull
    @Valid
    @JsonProperty("conflictingPrice")
    public Price getConflictingPrice();

    /**
     *  <p><code>"Duplicate price key: $priceKey. The price key must be unique per variant."</code></p>
     * @param message value to be set
     */
    
    public void setMessage(final String message);
    
    
    /**
     *  <p>Conflicting Embedded Price.</p>
     * @param conflictingPrice value to be set
     */
    
    public void setConflictingPrice(final Price conflictingPrice);
    

    /**
     * factory method
     * @return instance of DuplicatePriceKeyError
     */
    public static DuplicatePriceKeyError of(){
        return new DuplicatePriceKeyErrorImpl();
    }
    

    /**
     * factory method to create a shallow copy DuplicatePriceKeyError
     * @param template instance to be copied
     * @return copy instance
     */
    public static DuplicatePriceKeyError of(final DuplicatePriceKeyError template) {
        DuplicatePriceKeyErrorImpl instance = new DuplicatePriceKeyErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setConflictingPrice(template.getConflictingPrice());
        return instance;
    }

    /**
     * factory method to create a deep copy of DuplicatePriceKeyError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static DuplicatePriceKeyError deepCopy(@Nullable final DuplicatePriceKeyError template) {
        if (template == null) {
            return null;
        }
        DuplicatePriceKeyErrorImpl instance = new DuplicatePriceKeyErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setConflictingPrice(com.commercetools.api.models.common.Price.deepCopy(template.getConflictingPrice()));
        return instance;
    }

    /**
     * builder factory method for DuplicatePriceKeyError
     * @return builder
     */
    public static DuplicatePriceKeyErrorBuilder builder() {
        return DuplicatePriceKeyErrorBuilder.of();
    }
    
    /**
     * create builder for DuplicatePriceKeyError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DuplicatePriceKeyErrorBuilder builder(final DuplicatePriceKeyError template) {
        return DuplicatePriceKeyErrorBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withDuplicatePriceKeyError(Function<DuplicatePriceKeyError, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<DuplicatePriceKeyError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DuplicatePriceKeyError>() {
            @Override
            public String toString() {
                return "TypeReference<DuplicatePriceKeyError>";
            }
        };
    }
}
