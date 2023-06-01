package com.commercetools.api.models.store;

import com.commercetools.api.models.store.StoreUpdateAction;
import com.commercetools.api.models.store.StoreSetLanguagesAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StoreSetLanguagesActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreSetLanguagesAction storeSetLanguagesAction = StoreSetLanguagesAction.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class StoreSetLanguagesActionBuilder implements Builder<StoreSetLanguagesAction> {

    
    @Nullable
    private java.util.List<String> languages;

    /**
     *  <p>Value to set.</p>
     * @param languages value to be set
     * @return Builder
     */
    
    public StoreSetLanguagesActionBuilder languages(@Nullable final String ...languages) {
        this.languages = new ArrayList<>(Arrays.asList(languages));
        return this;
    }
    
    /**
     *  <p>Value to set.</p>
     * @param languages value to be set
     * @return Builder
     */
    
    public StoreSetLanguagesActionBuilder languages(@Nullable final java.util.List<String> languages) {
        this.languages = languages;
        return this;
    }
    
    /**
     *  <p>Value to set.</p>
     * @param languages value to be set
     * @return Builder
     */
    
    public StoreSetLanguagesActionBuilder plusLanguages(@Nullable final String ...languages) {
        if (this.languages == null) {
            this.languages = new ArrayList<>();
        }
        this.languages.addAll(Arrays.asList(languages));
        return this;
    }
    
    
    

    /**
     *  <p>Value to set.</p>
     * @return languages
     */
    
    @Nullable
    public java.util.List<String> getLanguages(){
        return this.languages;
    }

    /**
     * builds StoreSetLanguagesAction with checking for non-null required values
     * @return StoreSetLanguagesAction
     */
    public StoreSetLanguagesAction build() {
        return new StoreSetLanguagesActionImpl(languages);
    }
    
    /**
     * builds StoreSetLanguagesAction without checking for non-null required values
     * @return StoreSetLanguagesAction
     */
    public StoreSetLanguagesAction buildUnchecked() {
        return new StoreSetLanguagesActionImpl(languages);
    }

    /**
     * factory method for an instance of StoreSetLanguagesActionBuilder
     * @return builder 
     */
    public static StoreSetLanguagesActionBuilder of() {
        return new StoreSetLanguagesActionBuilder();
    }

    /**
     * create builder for StoreSetLanguagesAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StoreSetLanguagesActionBuilder of(final StoreSetLanguagesAction template) {
        StoreSetLanguagesActionBuilder builder = new StoreSetLanguagesActionBuilder();
        builder.languages = template.getLanguages();
        return builder;
    }

}
