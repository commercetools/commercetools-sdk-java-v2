
package com.commercetools.ml.models.image_search_config;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeStatusUpdateAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeStatusUpdateAction changeStatusUpdateAction = ChangeStatusUpdateAction.builder()
 *             .status(ImageSearchConfigStatus.ON)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ChangeStatusUpdateActionImpl.class)
public interface ChangeStatusUpdateAction extends ImageSearchConfigUpdateAction {

    /**
     * discriminator value for ChangeStatusUpdateAction
     */
    String CHANGE_STATUS = "changeStatus";

    /**
     *
     * @return status
     */
    @NotNull
    @JsonProperty("status")
    public ImageSearchConfigStatus getStatus();

    /**
     * set status
     * @param status value to be set
     */

    public void setStatus(final ImageSearchConfigStatus status);

    /**
     * factory method
     * @return instance of ChangeStatusUpdateAction
     */
    public static ChangeStatusUpdateAction of() {
        return new ChangeStatusUpdateActionImpl();
    }

    /**
     * factory method to copy an instance of ChangeStatusUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ChangeStatusUpdateAction of(final ChangeStatusUpdateAction template) {
        ChangeStatusUpdateActionImpl instance = new ChangeStatusUpdateActionImpl();
        instance.setStatus(template.getStatus());
        return instance;
    }

    /**
     * builder factory method for ChangeStatusUpdateAction
     * @return builder
     */
    public static ChangeStatusUpdateActionBuilder builder() {
        return ChangeStatusUpdateActionBuilder.of();
    }

    /**
     * create builder for ChangeStatusUpdateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeStatusUpdateActionBuilder builder(final ChangeStatusUpdateAction template) {
        return ChangeStatusUpdateActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withChangeStatusUpdateAction(Function<ChangeStatusUpdateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ChangeStatusUpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeStatusUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeStatusUpdateAction>";
            }
        };
    }
}
