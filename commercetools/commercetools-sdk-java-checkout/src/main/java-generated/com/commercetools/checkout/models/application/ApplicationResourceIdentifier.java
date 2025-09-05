
package com.commercetools.checkout.models.application;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.checkout.models.common.ResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Resource identifier to an <span>Application</span>. Either <code>id</code> or <code>key</code> is required. If both are set, an <span>InvalidJsonInput</span> error is returned.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ApplicationResourceIdentifier applicationResourceIdentifier = ApplicationResourceIdentifier.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("application")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ApplicationResourceIdentifierImpl.class)
public interface ApplicationResourceIdentifier extends ResourceIdentifier {

    /**
     * discriminator value for ApplicationResourceIdentifier
     */
    String APPLICATION = "application";

    /**
     *  <p>Unique identifier of the referenced Application. Required if <code>key</code> is absent.</p>
     * @return id
     */

    @JsonProperty("id")
    public String getId();

    /**
     *  <p>User-defined unique identifier of the referenced Application. Required if <code>id</code> is absent.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Unique identifier of the referenced Application. Required if <code>key</code> is absent.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>User-defined unique identifier of the referenced Application. Required if <code>id</code> is absent.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     * factory method
     * @return instance of ApplicationResourceIdentifier
     */
    public static ApplicationResourceIdentifier of() {
        return new ApplicationResourceIdentifierImpl();
    }

    /**
     * factory method to create a shallow copy ApplicationResourceIdentifier
     * @param template instance to be copied
     * @return copy instance
     */
    public static ApplicationResourceIdentifier of(final ApplicationResourceIdentifier template) {
        ApplicationResourceIdentifierImpl instance = new ApplicationResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    public ApplicationResourceIdentifier copyDeep();

    /**
     * factory method to create a deep copy of ApplicationResourceIdentifier
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ApplicationResourceIdentifier deepCopy(@Nullable final ApplicationResourceIdentifier template) {
        if (template == null) {
            return null;
        }
        ApplicationResourceIdentifierImpl instance = new ApplicationResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * builder factory method for ApplicationResourceIdentifier
     * @return builder
     */
    public static ApplicationResourceIdentifierBuilder builder() {
        return ApplicationResourceIdentifierBuilder.of();
    }

    /**
     * create builder for ApplicationResourceIdentifier instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ApplicationResourceIdentifierBuilder builder(final ApplicationResourceIdentifier template) {
        return ApplicationResourceIdentifierBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withApplicationResourceIdentifier(Function<ApplicationResourceIdentifier, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ApplicationResourceIdentifier> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ApplicationResourceIdentifier>() {
            @Override
            public String toString() {
                return "TypeReference<ApplicationResourceIdentifier>";
            }
        };
    }
}
