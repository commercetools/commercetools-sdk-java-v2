
package com.commercetools.api.models.store;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StoreSetLanguagesActionBuilder {

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

    @Nullable
    public java.util.List<String> getLanguages() {
        return this.languages;
    }

    public StoreSetLanguagesAction build() {
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
