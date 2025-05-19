
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by a Customer email verification.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     VerifyEmailChange verifyEmailChange = VerifyEmailChange.builder()
 *             .change("{change}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("VerifyEmailChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = VerifyEmailChangeImpl.class)
public interface VerifyEmailChange extends Change {

    /**
     * discriminator value for VerifyEmailChange
     */
    String VERIFY_EMAIL_CHANGE = "VerifyEmailChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     * factory method
     * @return instance of VerifyEmailChange
     */
    public static VerifyEmailChange of() {
        return new VerifyEmailChangeImpl();
    }

    /**
     * factory method to create a shallow copy VerifyEmailChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static VerifyEmailChange of(final VerifyEmailChange template) {
        VerifyEmailChangeImpl instance = new VerifyEmailChangeImpl();
        instance.setChange(template.getChange());
        return instance;
    }

    public VerifyEmailChange copyDeep();

    /**
     * factory method to create a deep copy of VerifyEmailChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static VerifyEmailChange deepCopy(@Nullable final VerifyEmailChange template) {
        if (template == null) {
            return null;
        }
        VerifyEmailChangeImpl instance = new VerifyEmailChangeImpl();
        instance.setChange(template.getChange());
        return instance;
    }

    /**
     * builder factory method for VerifyEmailChange
     * @return builder
     */
    public static VerifyEmailChangeBuilder builder() {
        return VerifyEmailChangeBuilder.of();
    }

    /**
     * create builder for VerifyEmailChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VerifyEmailChangeBuilder builder(final VerifyEmailChange template) {
        return VerifyEmailChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withVerifyEmailChange(Function<VerifyEmailChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<VerifyEmailChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<VerifyEmailChange>() {
            @Override
            public String toString() {
                return "TypeReference<VerifyEmailChange>";
            }
        };
    }
}
