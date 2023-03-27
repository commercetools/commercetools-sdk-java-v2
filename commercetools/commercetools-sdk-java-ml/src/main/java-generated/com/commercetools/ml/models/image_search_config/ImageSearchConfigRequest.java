
package com.commercetools.ml.models.image_search_config;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ImageSearchConfigRequest
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ImageSearchConfigRequest imageSearchConfigRequest = ImageSearchConfigRequest.builder()
 *             .plusActions(actionsBuilder -> actionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ImageSearchConfigRequestImpl.class)
public interface ImageSearchConfigRequest {

    /**
     *  <p>The list of update actions to be performed on the project.</p>
     * @return actions
     */
    @NotNull
    @Valid
    @JsonProperty("actions")
    public List<ImageSearchConfigUpdateAction> getActions();

    /**
     *  <p>The list of update actions to be performed on the project.</p>
     * @param actions values to be set
     */

    @JsonIgnore
    public void setActions(final ImageSearchConfigUpdateAction... actions);

    /**
     *  <p>The list of update actions to be performed on the project.</p>
     * @param actions values to be set
     */

    public void setActions(final List<ImageSearchConfigUpdateAction> actions);

    /**
     * factory method
     * @return instance of ImageSearchConfigRequest
     */
    public static ImageSearchConfigRequest of() {
        return new ImageSearchConfigRequestImpl();
    }

    /**
     * factory method to copy an instance of ImageSearchConfigRequest
     * @param template instance to be copied
     * @return copy instance
     */
    public static ImageSearchConfigRequest of(final ImageSearchConfigRequest template) {
        ImageSearchConfigRequestImpl instance = new ImageSearchConfigRequestImpl();
        instance.setActions(template.getActions());
        return instance;
    }

    /**
     * builder factory method for ImageSearchConfigRequest
     * @return builder
     */
    public static ImageSearchConfigRequestBuilder builder() {
        return ImageSearchConfigRequestBuilder.of();
    }

    /**
     * create builder for ImageSearchConfigRequest instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ImageSearchConfigRequestBuilder builder(final ImageSearchConfigRequest template) {
        return ImageSearchConfigRequestBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withImageSearchConfigRequest(Function<ImageSearchConfigRequest, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ImageSearchConfigRequest> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ImageSearchConfigRequest>() {
            @Override
            public String toString() {
                return "TypeReference<ImageSearchConfigRequest>";
            }
        };
    }
}
