
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
     *  <p>Locales added to the Store after the Set Languages update action.</p>
     * @param addedLanguages value to be set
     * @return Builder
     */

    public StoreLanguagesChangedMessagePayloadBuilder addedLanguages(@Nullable final String... addedLanguages) {
        this.addedLanguages = new ArrayList<>(Arrays.asList(addedLanguages));
        return this;
    }

    /**
     *  <p>Locales added to the Store after the Set Languages update action.</p>
     * @param addedLanguages value to be set
     * @return Builder
     */

    public StoreLanguagesChangedMessagePayloadBuilder addedLanguages(
            @Nullable final java.util.List<String> addedLanguages) {
        this.addedLanguages = addedLanguages;
        return this;
    }

    /**
     *  <p>Locales added to the Store after the Set Languages update action.</p>
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
     *  <p>Locales removed from the Store during the Set Languages update action.</p>
     * @param removedLanguages value to be set
     * @return Builder
     */

    public StoreLanguagesChangedMessagePayloadBuilder removedLanguages(@Nullable final String... removedLanguages) {
        this.removedLanguages = new ArrayList<>(Arrays.asList(removedLanguages));
        return this;
    }

    /**
     *  <p>Locales removed from the Store during the Set Languages update action.</p>
     * @param removedLanguages value to be set
     * @return Builder
     */

    public StoreLanguagesChangedMessagePayloadBuilder removedLanguages(
            @Nullable final java.util.List<String> removedLanguages) {
        this.removedLanguages = removedLanguages;
        return this;
    }

    /**
     *  <p>Locales removed from the Store during the Set Languages update action.</p>
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

    @Nullable
    public java.util.List<String> getAddedLanguages() {
        return this.addedLanguages;
    }

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

    public static StoreLanguagesChangedMessagePayloadBuilder of() {
        return new StoreLanguagesChangedMessagePayloadBuilder();
    }

    public static StoreLanguagesChangedMessagePayloadBuilder of(final StoreLanguagesChangedMessagePayload template) {
        StoreLanguagesChangedMessagePayloadBuilder builder = new StoreLanguagesChangedMessagePayloadBuilder();
        builder.addedLanguages = template.getAddedLanguages();
        builder.removedLanguages = template.getRemovedLanguages();
        return builder;
    }

}
