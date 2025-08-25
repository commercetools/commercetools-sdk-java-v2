
package com.commercetools.api.models.message;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StoreLanguagesChangedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreLanguagesChangedMessagePayload storeLanguagesChangedMessagePayload = StoreLanguagesChangedMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StoreLanguagesChangedMessagePayloadBuilder implements Builder<StoreLanguagesChangedMessagePayload> {

    @Nullable
    private java.util.List<String> addedLanguages;

    @Nullable
    private java.util.List<String> removedLanguages;

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Locale" rel="nofollow">Locales</a> added to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreSetLanguagesAction" rel="nofollow">Set Languages</a> update action.</p>
     * @param addedLanguages value to be set
     * @return Builder
     */

    public StoreLanguagesChangedMessagePayloadBuilder addedLanguages(@Nullable final String... addedLanguages) {
        this.addedLanguages = new ArrayList<>(Arrays.asList(addedLanguages));
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Locale" rel="nofollow">Locales</a> added to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreSetLanguagesAction" rel="nofollow">Set Languages</a> update action.</p>
     * @param addedLanguages value to be set
     * @return Builder
     */

    public StoreLanguagesChangedMessagePayloadBuilder addedLanguages(
            @Nullable final java.util.List<String> addedLanguages) {
        this.addedLanguages = addedLanguages;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Locale" rel="nofollow">Locales</a> added to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreSetLanguagesAction" rel="nofollow">Set Languages</a> update action.</p>
     * @param addedLanguages value to be set
     * @return Builder
     */

    public StoreLanguagesChangedMessagePayloadBuilder plusAddedLanguages(@Nullable final String... addedLanguages) {
        if (this.addedLanguages == null) {
            this.addedLanguages = new ArrayList<>();
        }
        this.addedLanguages.addAll(Arrays.asList(addedLanguages));
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Locale" rel="nofollow">Locales</a> removed from the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> during the <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreSetLanguagesAction" rel="nofollow">Set Languages</a> update action.</p>
     * @param removedLanguages value to be set
     * @return Builder
     */

    public StoreLanguagesChangedMessagePayloadBuilder removedLanguages(@Nullable final String... removedLanguages) {
        this.removedLanguages = new ArrayList<>(Arrays.asList(removedLanguages));
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Locale" rel="nofollow">Locales</a> removed from the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> during the <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreSetLanguagesAction" rel="nofollow">Set Languages</a> update action.</p>
     * @param removedLanguages value to be set
     * @return Builder
     */

    public StoreLanguagesChangedMessagePayloadBuilder removedLanguages(
            @Nullable final java.util.List<String> removedLanguages) {
        this.removedLanguages = removedLanguages;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Locale" rel="nofollow">Locales</a> removed from the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> during the <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreSetLanguagesAction" rel="nofollow">Set Languages</a> update action.</p>
     * @param removedLanguages value to be set
     * @return Builder
     */

    public StoreLanguagesChangedMessagePayloadBuilder plusRemovedLanguages(@Nullable final String... removedLanguages) {
        if (this.removedLanguages == null) {
            this.removedLanguages = new ArrayList<>();
        }
        this.removedLanguages.addAll(Arrays.asList(removedLanguages));
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Locale" rel="nofollow">Locales</a> added to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreSetLanguagesAction" rel="nofollow">Set Languages</a> update action.</p>
     * @return addedLanguages
     */

    @Nullable
    public java.util.List<String> getAddedLanguages() {
        return this.addedLanguages;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Locale" rel="nofollow">Locales</a> removed from the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> during the <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreSetLanguagesAction" rel="nofollow">Set Languages</a> update action.</p>
     * @return removedLanguages
     */

    @Nullable
    public java.util.List<String> getRemovedLanguages() {
        return this.removedLanguages;
    }

    /**
     * builds StoreLanguagesChangedMessagePayload with checking for non-null required values
     * @return StoreLanguagesChangedMessagePayload
     */
    public StoreLanguagesChangedMessagePayload build() {
        return new StoreLanguagesChangedMessagePayloadImpl(addedLanguages, removedLanguages);
    }

    /**
     * builds StoreLanguagesChangedMessagePayload without checking for non-null required values
     * @return StoreLanguagesChangedMessagePayload
     */
    public StoreLanguagesChangedMessagePayload buildUnchecked() {
        return new StoreLanguagesChangedMessagePayloadImpl(addedLanguages, removedLanguages);
    }

    /**
     * factory method for an instance of StoreLanguagesChangedMessagePayloadBuilder
     * @return builder
     */
    public static StoreLanguagesChangedMessagePayloadBuilder of() {
        return new StoreLanguagesChangedMessagePayloadBuilder();
    }

    /**
     * create builder for StoreLanguagesChangedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StoreLanguagesChangedMessagePayloadBuilder of(final StoreLanguagesChangedMessagePayload template) {
        StoreLanguagesChangedMessagePayloadBuilder builder = new StoreLanguagesChangedMessagePayloadBuilder();
        builder.addedLanguages = template.getAddedLanguages();
        builder.removedLanguages = template.getRemovedLanguages();
        return builder;
    }

}
