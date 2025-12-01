
package com.commercetools.checkout.models.application;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.checkout.models.common.Reference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Reference to an <a href="https://docs.commercetools.com/apis/ctp:checkout:type:Application" rel="nofollow">Application</a>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ApplicationReference applicationReference = ApplicationReference.builder()
 *             .id("{id}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("application")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ApplicationReferenceImpl.class)
public interface ApplicationReference extends Reference {

    /**
     * discriminator value for ApplicationReference
     */
    String APPLICATION = "application";

    /**
     *  <p>Unique identifier of the referenced Application.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Unique identifier of the referenced Application.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     * factory method
     * @return instance of ApplicationReference
     */
    public static ApplicationReference of() {
        return new ApplicationReferenceImpl();
    }

    /**
     * factory method to create a shallow copy ApplicationReference
     * @param template instance to be copied
     * @return copy instance
     */
    public static ApplicationReference of(final ApplicationReference template) {
        ApplicationReferenceImpl instance = new ApplicationReferenceImpl();
        instance.setId(template.getId());
        return instance;
    }

    public ApplicationReference copyDeep();

    /**
     * factory method to create a deep copy of ApplicationReference
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ApplicationReference deepCopy(@Nullable final ApplicationReference template) {
        if (template == null) {
            return null;
        }
        ApplicationReferenceImpl instance = new ApplicationReferenceImpl();
        instance.setId(template.getId());
        return instance;
    }

    /**
     * builder factory method for ApplicationReference
     * @return builder
     */
    public static ApplicationReferenceBuilder builder() {
        return ApplicationReferenceBuilder.of();
    }

    /**
     * create builder for ApplicationReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ApplicationReferenceBuilder builder(final ApplicationReference template) {
        return ApplicationReferenceBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withApplicationReference(Function<ApplicationReference, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ApplicationReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ApplicationReference>() {
            @Override
            public String toString() {
                return "TypeReference<ApplicationReference>";
            }
        };
    }
}
