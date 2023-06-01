package com.commercetools.api.models.project;

import com.commercetools.api.models.project.ProjectUpdateAction;
import com.commercetools.api.models.project.ProjectChangeCurrenciesAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProjectChangeCurrenciesActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProjectChangeCurrenciesAction projectChangeCurrenciesAction = ProjectChangeCurrenciesAction.builder()
 *             .plusCurrencies(currenciesBuilder -> currenciesBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ProjectChangeCurrenciesActionBuilder implements Builder<ProjectChangeCurrenciesAction> {

    
    
    private java.util.List<String> currencies;

    /**
     *  <p>New value to set. Must not be empty.</p>
     * @param currencies value to be set
     * @return Builder
     */
    
    public ProjectChangeCurrenciesActionBuilder currencies( final String ...currencies) {
        this.currencies = new ArrayList<>(Arrays.asList(currencies));
        return this;
    }
    
    /**
     *  <p>New value to set. Must not be empty.</p>
     * @param currencies value to be set
     * @return Builder
     */
    
    public ProjectChangeCurrenciesActionBuilder currencies( final java.util.List<String> currencies) {
        this.currencies = currencies;
        return this;
    }
    
    /**
     *  <p>New value to set. Must not be empty.</p>
     * @param currencies value to be set
     * @return Builder
     */
    
    public ProjectChangeCurrenciesActionBuilder plusCurrencies( final String ...currencies) {
        if (this.currencies == null) {
            this.currencies = new ArrayList<>();
        }
        this.currencies.addAll(Arrays.asList(currencies));
        return this;
    }
    
    
    

    /**
     *  <p>New value to set. Must not be empty.</p>
     * @return currencies
     */
    
    
    public java.util.List<String> getCurrencies(){
        return this.currencies;
    }

    /**
     * builds ProjectChangeCurrenciesAction with checking for non-null required values
     * @return ProjectChangeCurrenciesAction
     */
    public ProjectChangeCurrenciesAction build() {
        Objects.requireNonNull(currencies, ProjectChangeCurrenciesAction.class + ": currencies is missing");
        return new ProjectChangeCurrenciesActionImpl(currencies);
    }
    
    /**
     * builds ProjectChangeCurrenciesAction without checking for non-null required values
     * @return ProjectChangeCurrenciesAction
     */
    public ProjectChangeCurrenciesAction buildUnchecked() {
        return new ProjectChangeCurrenciesActionImpl(currencies);
    }

    /**
     * factory method for an instance of ProjectChangeCurrenciesActionBuilder
     * @return builder 
     */
    public static ProjectChangeCurrenciesActionBuilder of() {
        return new ProjectChangeCurrenciesActionBuilder();
    }

    /**
     * create builder for ProjectChangeCurrenciesAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProjectChangeCurrenciesActionBuilder of(final ProjectChangeCurrenciesAction template) {
        ProjectChangeCurrenciesActionBuilder builder = new ProjectChangeCurrenciesActionBuilder();
        builder.currencies = template.getCurrencies();
        return builder;
    }

}
