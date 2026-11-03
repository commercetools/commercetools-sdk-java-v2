
package com.commercetools.api.models.warning;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;
import tools.jackson.databind.annotation.*;

/**
 *  <p>Contained in responses to an <span>Update Category</span> request with response status code <code>202 Accepted</code>. This is the case if the request contains a <a href="https://docs.commercetools.com/apis/ctp:api:type:CategorySetStoresWithDescendantsAction" rel="nofollow">Set Stores with Descendants</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:CategoryAddStoreWithDescendantsAction" rel="nofollow">Add Store with Descendants</a>, or <a href="https://docs.commercetools.com/apis/ctp:api:type:CategoryRemoveStoreWithDescendantsAction" rel="nofollow">Remove Store with Descendants</a> update action. Indicates that the API is still applying the Store change to the Category and its descendant Categories.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreSettingOngoingWarning storeSettingOngoingWarning = StoreSettingOngoingWarning.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("StoreSettingOngoing")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StoreSettingOngoingWarningImpl.class)
public interface StoreSettingOngoingWarning extends WarningObject {

    /**
     * discriminator value for StoreSettingOngoingWarning
     */
    String STORE_SETTING_ONGOING = "StoreSettingOngoing";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p><code>"The store setting is still ongoing."</code></p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p><code>"The store setting is still ongoing."</code></p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     * factory method
     * @return instance of StoreSettingOngoingWarning
     */
    public static StoreSettingOngoingWarning of() {
        return new StoreSettingOngoingWarningImpl();
    }

    /**
     * factory method to create a shallow copy StoreSettingOngoingWarning
     * @param template instance to be copied
     * @return copy instance
     */
    public static StoreSettingOngoingWarning of(final StoreSettingOngoingWarning template) {
        StoreSettingOngoingWarningImpl instance = new StoreSettingOngoingWarningImpl();
        instance.setMessage(template.getMessage());
        return instance;
    }

    public StoreSettingOngoingWarning copyDeep();

    /**
     * factory method to create a deep copy of StoreSettingOngoingWarning
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StoreSettingOngoingWarning deepCopy(@Nullable final StoreSettingOngoingWarning template) {
        if (template == null) {
            return null;
        }
        StoreSettingOngoingWarningImpl instance = new StoreSettingOngoingWarningImpl();
        instance.setMessage(template.getMessage());
        return instance;
    }

    /**
     * builder factory method for StoreSettingOngoingWarning
     * @return builder
     */
    public static StoreSettingOngoingWarningBuilder builder() {
        return StoreSettingOngoingWarningBuilder.of();
    }

    /**
     * create builder for StoreSettingOngoingWarning instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StoreSettingOngoingWarningBuilder builder(final StoreSettingOngoingWarning template) {
        return StoreSettingOngoingWarningBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStoreSettingOngoingWarning(Function<StoreSettingOngoingWarning, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<StoreSettingOngoingWarning> typeReference() {
        return new tools.jackson.core.type.TypeReference<StoreSettingOngoingWarning>() {
            @Override
            public String toString() {
                return "TypeReference<StoreSettingOngoingWarning>";
            }
        };
    }
}
