
package com.commercetools.api.models.store;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class StoreSetLanguagesActionBuilder implements Builder<StoreSetLanguagesAction> {

    @Nullable
    private java.util.List<String> languages;

    public StoreSetLanguagesActionBuilder languages(@Nullable final String... languages) {
        this.languages = new ArrayList<>(Arrays.asList(languages));
        return this;
    }

    public StoreSetLanguagesActionBuilder languages(@Nullable final java.util.List<String> languages) {
        this.languages = languages;
        return this;
    }

    public StoreSetLanguagesActionBuilder plusLanguages(@Nullable final String... languages) {
        if (this.languages == null) {
            this.languages = new ArrayList<>();
        }
        this.languages.addAll(Arrays.asList(languages));
        return this;
    }

    @Nullable
    public java.util.List<String> getLanguages() {
        return this.languages;
    }

    public StoreSetLanguagesAction build() {
        return new StoreSetLanguagesActionImpl(languages);
    }

    /**
     * builds StoreSetLanguagesAction without checking for non null required values
     */
    public StoreSetLanguagesAction buildUnchecked() {
        return new StoreSetLanguagesActionImpl(languages);
    }

    public static StoreSetLanguagesActionBuilder of() {
        return new StoreSetLanguagesActionBuilder();
    }

    public static StoreSetLanguagesActionBuilder of(final StoreSetLanguagesAction template) {
        StoreSetLanguagesActionBuilder builder = new StoreSetLanguagesActionBuilder();
        builder.languages = template.getLanguages();
        return builder;
    }

}
