
package com.commercetools.history.models.change_value;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * ValidFromAndUntilValue
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ValidFromAndUntilValue validFromAndUntilValue = ValidFromAndUntilValue.builder()
 *             .validFrom("{validFrom}")
 *             .validUntil("{validUntil}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ValidFromAndUntilValueImpl.class)
public interface ValidFromAndUntilValue {

    /**
     *  <p>Date and time (UTC) from when the Discount is effective.</p>
     * @return validFrom
     */
    @NotNull
    @JsonProperty("validFrom")
    public String getValidFrom();

    /**
     *  <p>Date and time (UTC) until when the Discount is effective.</p>
     * @return validUntil
     */
    @NotNull
    @JsonProperty("validUntil")
    public String getValidUntil();

    /**
     *  <p>Date and time (UTC) from when the Discount is effective.</p>
     * @param validFrom value to be set
     */

    public void setValidFrom(final String validFrom);

    /**
     *  <p>Date and time (UTC) until when the Discount is effective.</p>
     * @param validUntil value to be set
     */

    public void setValidUntil(final String validUntil);

    /**
     * factory method
     * @return instance of ValidFromAndUntilValue
     */
    public static ValidFromAndUntilValue of() {
        return new ValidFromAndUntilValueImpl();
    }

    /**
     * factory method to create a shallow copy ValidFromAndUntilValue
     * @param template instance to be copied
     * @return copy instance
     */
    public static ValidFromAndUntilValue of(final ValidFromAndUntilValue template) {
        ValidFromAndUntilValueImpl instance = new ValidFromAndUntilValueImpl();
        instance.setValidFrom(template.getValidFrom());
        instance.setValidUntil(template.getValidUntil());
        return instance;
    }

    public ValidFromAndUntilValue copyDeep();

    /**
     * factory method to create a deep copy of ValidFromAndUntilValue
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ValidFromAndUntilValue deepCopy(@Nullable final ValidFromAndUntilValue template) {
        if (template == null) {
            return null;
        }
        ValidFromAndUntilValueImpl instance = new ValidFromAndUntilValueImpl();
        instance.setValidFrom(template.getValidFrom());
        instance.setValidUntil(template.getValidUntil());
        return instance;
    }

    /**
     * builder factory method for ValidFromAndUntilValue
     * @return builder
     */
    public static ValidFromAndUntilValueBuilder builder() {
        return ValidFromAndUntilValueBuilder.of();
    }

    /**
     * create builder for ValidFromAndUntilValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ValidFromAndUntilValueBuilder builder(final ValidFromAndUntilValue template) {
        return ValidFromAndUntilValueBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withValidFromAndUntilValue(Function<ValidFromAndUntilValue, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ValidFromAndUntilValue> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ValidFromAndUntilValue>() {
            @Override
            public String toString() {
                return "TypeReference<ValidFromAndUntilValue>";
            }
        };
    }
}
