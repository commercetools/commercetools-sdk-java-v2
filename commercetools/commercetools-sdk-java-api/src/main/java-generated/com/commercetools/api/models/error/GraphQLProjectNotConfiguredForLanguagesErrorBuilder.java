package com.commercetools.api.models.error;

import com.commercetools.api.models.error.GraphQLErrorObject;
import com.commercetools.api.models.error.GraphQLProjectNotConfiguredForLanguagesError;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLProjectNotConfiguredForLanguagesErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLProjectNotConfiguredForLanguagesError graphQLProjectNotConfiguredForLanguagesError = GraphQLProjectNotConfiguredForLanguagesError.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class GraphQLProjectNotConfiguredForLanguagesErrorBuilder implements Builder<GraphQLProjectNotConfiguredForLanguagesError> {

    
    
    private Map<String, java.lang.Object> values = new HashMap<>();
    
    
    @Nullable
    private java.util.List<String> languages;

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */
    
    public GraphQLProjectNotConfiguredForLanguagesErrorBuilder values( final Map<String, java.lang.Object> values){
        this.values = values;
        return this;
    }
    
    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */
    
    public GraphQLProjectNotConfiguredForLanguagesErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }
    
    
    /**
     *  <p>Languages configured for the Store.</p>
     * @param languages value to be set
     * @return Builder
     */
    
    public GraphQLProjectNotConfiguredForLanguagesErrorBuilder languages(@Nullable final String ...languages) {
        this.languages = new ArrayList<>(Arrays.asList(languages));
        return this;
    }
    
    /**
     *  <p>Languages configured for the Store.</p>
     * @param languages value to be set
     * @return Builder
     */
    
    public GraphQLProjectNotConfiguredForLanguagesErrorBuilder languages(@Nullable final java.util.List<String> languages) {
        this.languages = languages;
        return this;
    }
    
    /**
     *  <p>Languages configured for the Store.</p>
     * @param languages value to be set
     * @return Builder
     */
    
    public GraphQLProjectNotConfiguredForLanguagesErrorBuilder plusLanguages(@Nullable final String ...languages) {
        if (this.languages == null) {
            this.languages = new ArrayList<>();
        }
        this.languages.addAll(Arrays.asList(languages));
        return this;
    }
    
    
    

    /**
     *  <p>Error-specific additional fields.</p>
     * @return pattern properties
     */
    
    
    public Map<String, java.lang.Object> getValues(){
        return this.values;
    }
    
    /**
     *  <p>Languages configured for the Store.</p>
     * @return languages
     */
    
    @Nullable
    public java.util.List<String> getLanguages(){
        return this.languages;
    }

    /**
     * builds GraphQLProjectNotConfiguredForLanguagesError with checking for non-null required values
     * @return GraphQLProjectNotConfiguredForLanguagesError
     */
    public GraphQLProjectNotConfiguredForLanguagesError build() {
        return new GraphQLProjectNotConfiguredForLanguagesErrorImpl(values, languages);
    }
    
    /**
     * builds GraphQLProjectNotConfiguredForLanguagesError without checking for non-null required values
     * @return GraphQLProjectNotConfiguredForLanguagesError
     */
    public GraphQLProjectNotConfiguredForLanguagesError buildUnchecked() {
        return new GraphQLProjectNotConfiguredForLanguagesErrorImpl(values, languages);
    }

    /**
     * factory method for an instance of GraphQLProjectNotConfiguredForLanguagesErrorBuilder
     * @return builder 
     */
    public static GraphQLProjectNotConfiguredForLanguagesErrorBuilder of() {
        return new GraphQLProjectNotConfiguredForLanguagesErrorBuilder();
    }

    /**
     * create builder for GraphQLProjectNotConfiguredForLanguagesError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLProjectNotConfiguredForLanguagesErrorBuilder of(final GraphQLProjectNotConfiguredForLanguagesError template) {
        GraphQLProjectNotConfiguredForLanguagesErrorBuilder builder = new GraphQLProjectNotConfiguredForLanguagesErrorBuilder();
        builder.values = template.values();
        builder.languages = template.getLanguages();
        return builder;
    }

}
