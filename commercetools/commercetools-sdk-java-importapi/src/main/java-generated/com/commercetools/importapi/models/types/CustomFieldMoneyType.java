package com.commercetools.importapi.models.types;

import com.commercetools.importapi.models.types.FieldType;
import com.commercetools.importapi.models.types.CustomFieldMoneyTypeImpl;

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
 *  <p>Field type for CentPrecisionMoney values.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomFieldMoneyType customFieldMoneyType = CustomFieldMoneyType.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = CustomFieldMoneyTypeImpl.class)
public interface CustomFieldMoneyType extends FieldType {

    /**
     * discriminator value for CustomFieldMoneyType
     */
    String MONEY = "Money";



    /**
     * factory method
     * @return instance of CustomFieldMoneyType
     */
    public static CustomFieldMoneyType of(){
        return new CustomFieldMoneyTypeImpl();
    }
    

    /**
     * factory method to create a shallow copy CustomFieldMoneyType
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomFieldMoneyType of(final CustomFieldMoneyType template) {
        CustomFieldMoneyTypeImpl instance = new CustomFieldMoneyTypeImpl();
        return instance;
    }

    /**
     * factory method to create a deep copy of CustomFieldMoneyType
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomFieldMoneyType deepCopy(@Nullable final CustomFieldMoneyType template) {
        if (template == null) {
            return null;
        }
        CustomFieldMoneyTypeImpl instance = new CustomFieldMoneyTypeImpl();
        return instance;
    }

    /**
     * builder factory method for CustomFieldMoneyType
     * @return builder
     */
    public static CustomFieldMoneyTypeBuilder builder() {
        return CustomFieldMoneyTypeBuilder.of();
    }
    
    /**
     * create builder for CustomFieldMoneyType instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomFieldMoneyTypeBuilder builder(final CustomFieldMoneyType template) {
        return CustomFieldMoneyTypeBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomFieldMoneyType(Function<CustomFieldMoneyType, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomFieldMoneyType> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomFieldMoneyType>() {
            @Override
            public String toString() {
                return "TypeReference<CustomFieldMoneyType>";
            }
        };
    }
}
