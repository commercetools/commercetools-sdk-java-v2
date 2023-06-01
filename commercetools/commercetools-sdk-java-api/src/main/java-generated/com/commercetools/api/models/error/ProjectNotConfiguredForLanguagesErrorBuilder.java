package com.commercetools.api.models.error;

import com.commercetools.api.models.error.ErrorObject;
import com.commercetools.api.models.error.ProjectNotConfiguredForLanguagesError;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProjectNotConfiguredForLanguagesErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProjectNotConfiguredForLanguagesError projectNotConfiguredForLanguagesError = ProjectNotConfiguredForLanguagesError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ProjectNotConfiguredForLanguagesErrorBuilder implements Builder<ProjectNotConfiguredForLanguagesError> {

    
    
    private String message;
    
    
    
    private Map<String, java.lang.Object> values = new HashMap<>();
    
    
    @Nullable
    private java.util.List<String> languages;

    
    /**
     *  <p><code>"The project is not configured for given languages."</code></p>
     * @param message value to be set
     * @return Builder
     */
    
    public ProjectNotConfiguredForLanguagesErrorBuilder message( final String message) {
        this.message = message;
        return this;
    }
    
    
    
    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */
    
    public ProjectNotConfiguredForLanguagesErrorBuilder values( final Map<String, java.lang.Object> values){
        this.values = values;
        return this;
    }
    
    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */
    
    public ProjectNotConfiguredForLanguagesErrorBuilder addValue(final String key, final java.lang.Object value) {
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
    
    public ProjectNotConfiguredForLanguagesErrorBuilder languages(@Nullable final String ...languages) {
        this.languages = new ArrayList<>(Arrays.asList(languages));
        return this;
    }
    
    /**
     *  <p>Languages configured for the Store.</p>
     * @param languages value to be set
     * @return Builder
     */
    
    public ProjectNotConfiguredForLanguagesErrorBuilder languages(@Nullable final java.util.List<String> languages) {
        this.languages = languages;
        return this;
    }
    
    /**
     *  <p>Languages configured for the Store.</p>
     * @param languages value to be set
     * @return Builder
     */
    
    public ProjectNotConfiguredForLanguagesErrorBuilder plusLanguages(@Nullable final String ...languages) {
        if (this.languages == null) {
            this.languages = new ArrayList<>();
        }
        this.languages.addAll(Arrays.asList(languages));
        return this;
    }
    
    
    

    /**
     *  <p><code>"The project is not configured for given languages."</code></p>
     * @return message
     */
    
    
    public String getMessage(){
        return this.message;
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
     * builds ProjectNotConfiguredForLanguagesError with checking for non-null required values
     * @return ProjectNotConfiguredForLanguagesError
     */
    public ProjectNotConfiguredForLanguagesError build() {
        Objects.requireNonNull(message, ProjectNotConfiguredForLanguagesError.class + ": message is missing");
        return new ProjectNotConfiguredForLanguagesErrorImpl(message, values, languages);
    }
    
    /**
     * builds ProjectNotConfiguredForLanguagesError without checking for non-null required values
     * @return ProjectNotConfiguredForLanguagesError
     */
    public ProjectNotConfiguredForLanguagesError buildUnchecked() {
        return new ProjectNotConfiguredForLanguagesErrorImpl(message, values, languages);
    }

    /**
     * factory method for an instance of ProjectNotConfiguredForLanguagesErrorBuilder
     * @return builder 
     */
    public static ProjectNotConfiguredForLanguagesErrorBuilder of() {
        return new ProjectNotConfiguredForLanguagesErrorBuilder();
    }

    /**
     * create builder for ProjectNotConfiguredForLanguagesError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProjectNotConfiguredForLanguagesErrorBuilder of(final ProjectNotConfiguredForLanguagesError template) {
        ProjectNotConfiguredForLanguagesErrorBuilder builder = new ProjectNotConfiguredForLanguagesErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        builder.languages = template.getLanguages();
        return builder;
    }

}
