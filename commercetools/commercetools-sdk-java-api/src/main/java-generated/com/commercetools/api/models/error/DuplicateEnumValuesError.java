package com.commercetools.api.models.error;

import com.commercetools.api.models.error.ErrorObject;
import com.commercetools.api.models.error.DuplicateEnumValuesErrorImpl;

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
 *  <p>Returned when an AttributeEnumType or AttributeLocalizedEnumType contains duplicate keys.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DuplicateEnumValuesError duplicateEnumValuesError = DuplicateEnumValuesError.builder()
 *             .message("{message}")
 *             .plusDuplicates(duplicatesBuilder -> duplicatesBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = DuplicateEnumValuesErrorImpl.class)
public interface DuplicateEnumValuesError extends ErrorObject {

    /**
     * discriminator value for DuplicateEnumValuesError
     */
    String DUPLICATE_ENUM_VALUES = "DuplicateEnumValues";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();
    /**
     *  <p><code>"The enum values contain duplicate keys: $listOfDuplicateKeys."</code></p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();
    /**
     *  <p>Duplicate keys.</p>
     * @return duplicates
     */
    @NotNull
    @JsonProperty("duplicates")
    public List<String> getDuplicates();

    /**
     *  <p><code>"The enum values contain duplicate keys: $listOfDuplicateKeys."</code></p>
     * @param message value to be set
     */
    
    public void setMessage(final String message);
    
    
    /**
     *  <p>Duplicate keys.</p>
     * @param duplicates values to be set
     */
    
    @JsonIgnore
    public void setDuplicates(final String ...duplicates);
    /**
     *  <p>Duplicate keys.</p>
     * @param duplicates values to be set
     */
    
    public void setDuplicates(final List<String> duplicates);

    /**
     * factory method
     * @return instance of DuplicateEnumValuesError
     */
    public static DuplicateEnumValuesError of(){
        return new DuplicateEnumValuesErrorImpl();
    }
    

    /**
     * factory method to create a shallow copy DuplicateEnumValuesError
     * @param template instance to be copied
     * @return copy instance
     */
    public static DuplicateEnumValuesError of(final DuplicateEnumValuesError template) {
        DuplicateEnumValuesErrorImpl instance = new DuplicateEnumValuesErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setDuplicates(template.getDuplicates());
        return instance;
    }

    /**
     * factory method to create a deep copy of DuplicateEnumValuesError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static DuplicateEnumValuesError deepCopy(@Nullable final DuplicateEnumValuesError template) {
        if (template == null) {
            return null;
        }
        DuplicateEnumValuesErrorImpl instance = new DuplicateEnumValuesErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setDuplicates(Optional.ofNullable(template.getDuplicates())
                .map(ArrayList::new)
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for DuplicateEnumValuesError
     * @return builder
     */
    public static DuplicateEnumValuesErrorBuilder builder() {
        return DuplicateEnumValuesErrorBuilder.of();
    }
    
    /**
     * create builder for DuplicateEnumValuesError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DuplicateEnumValuesErrorBuilder builder(final DuplicateEnumValuesError template) {
        return DuplicateEnumValuesErrorBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withDuplicateEnumValuesError(Function<DuplicateEnumValuesError, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<DuplicateEnumValuesError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DuplicateEnumValuesError>() {
            @Override
            public String toString() {
                return "TypeReference<DuplicateEnumValuesError>";
            }
        };
    }
}
