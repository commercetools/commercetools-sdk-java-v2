
package com.commercetools.api.models.store;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>This update action produces the <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreLanguagesChangedMessage" rel="nofollow">StoreLanguagesChanged</a> Message. Adding a language other than the ones defined in the <a href="https://docs.commercetools.com/apis/ctp:api:type:Project" rel="nofollow">Project</a> returns a <a href="https://docs.commercetools.com/apis/ctp:api:type:ProjectNotConfiguredForLanguagesError" rel="nofollow">ProjectNotConfiguredForLanguages</a> error.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreSetLanguagesAction storeSetLanguagesAction = StoreSetLanguagesAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setLanguages")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StoreSetLanguagesActionImpl.class)
public interface StoreSetLanguagesAction extends StoreUpdateAction {

    /**
     * discriminator value for StoreSetLanguagesAction
     */
    String SET_LANGUAGES = "setLanguages";

    /**
     *  <p>Value to set.</p>
     * @return languages
     */

    @JsonProperty("languages")
    public List<String> getLanguages();

    /**
     *  <p>Value to set.</p>
     * @param languages values to be set
     */

    @JsonIgnore
    public void setLanguages(final String... languages);

    /**
     *  <p>Value to set.</p>
     * @param languages values to be set
     */

    public void setLanguages(final List<String> languages);

    /**
     * factory method
     * @return instance of StoreSetLanguagesAction
     */
    public static StoreSetLanguagesAction of() {
        return new StoreSetLanguagesActionImpl();
    }

    /**
     * factory method to create a shallow copy StoreSetLanguagesAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StoreSetLanguagesAction of(final StoreSetLanguagesAction template) {
        StoreSetLanguagesActionImpl instance = new StoreSetLanguagesActionImpl();
        instance.setLanguages(template.getLanguages());
        return instance;
    }

    public StoreSetLanguagesAction copyDeep();

    /**
     * factory method to create a deep copy of StoreSetLanguagesAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StoreSetLanguagesAction deepCopy(@Nullable final StoreSetLanguagesAction template) {
        if (template == null) {
            return null;
        }
        StoreSetLanguagesActionImpl instance = new StoreSetLanguagesActionImpl();
        instance.setLanguages(Optional.ofNullable(template.getLanguages()).map(ArrayList::new).orElse(null));
        return instance;
    }

    /**
     * builder factory method for StoreSetLanguagesAction
     * @return builder
     */
    public static StoreSetLanguagesActionBuilder builder() {
        return StoreSetLanguagesActionBuilder.of();
    }

    /**
     * create builder for StoreSetLanguagesAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StoreSetLanguagesActionBuilder builder(final StoreSetLanguagesAction template) {
        return StoreSetLanguagesActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStoreSetLanguagesAction(Function<StoreSetLanguagesAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StoreSetLanguagesAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StoreSetLanguagesAction>() {
            @Override
            public String toString() {
                return "TypeReference<StoreSetLanguagesAction>";
            }
        };
    }
}
