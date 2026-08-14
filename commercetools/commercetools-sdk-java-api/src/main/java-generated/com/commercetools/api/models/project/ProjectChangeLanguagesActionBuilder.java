
package com.commercetools.api.models.project;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProjectChangeLanguagesActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProjectChangeLanguagesAction projectChangeLanguagesAction = ProjectChangeLanguagesAction.builder()
 *             .plusLanguages(languagesBuilder -> languagesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProjectChangeLanguagesActionBuilder implements Builder<ProjectChangeLanguagesAction> {

    private java.util.List<String> languages;

    /**
     *  <p>New value to set.</p>
     *  <p>If set to an empty value, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error is returned.</p>
     *  <p>If a language in use by a <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> is removed, a <a href="https://docs.commercetools.com/apis/ctp:api:type:LanguageUsedInStoresError" rel="nofollow">LanguageUsedInStores</a> error is returned.</p>
     * @param languages value to be set
     * @return Builder
     */

    public ProjectChangeLanguagesActionBuilder languages(final String... languages) {
        this.languages = new ArrayList<>(Arrays.asList(languages));
        return this;
    }

    /**
     *  <p>New value to set.</p>
     *  <p>If set to an empty value, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error is returned.</p>
     *  <p>If a language in use by a <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> is removed, a <a href="https://docs.commercetools.com/apis/ctp:api:type:LanguageUsedInStoresError" rel="nofollow">LanguageUsedInStores</a> error is returned.</p>
     * @param languages value to be set
     * @return Builder
     */

    public ProjectChangeLanguagesActionBuilder languages(final java.util.List<String> languages) {
        this.languages = languages;
        return this;
    }

    /**
     *  <p>New value to set.</p>
     *  <p>If set to an empty value, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error is returned.</p>
     *  <p>If a language in use by a <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> is removed, a <a href="https://docs.commercetools.com/apis/ctp:api:type:LanguageUsedInStoresError" rel="nofollow">LanguageUsedInStores</a> error is returned.</p>
     * @param languages value to be set
     * @return Builder
     */

    public ProjectChangeLanguagesActionBuilder plusLanguages(final String... languages) {
        if (this.languages == null) {
            this.languages = new ArrayList<>();
        }
        this.languages.addAll(Arrays.asList(languages));
        return this;
    }

    /**
     *  <p>New value to set.</p>
     *  <p>If set to an empty value, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error is returned.</p>
     *  <p>If a language in use by a <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> is removed, a <a href="https://docs.commercetools.com/apis/ctp:api:type:LanguageUsedInStoresError" rel="nofollow">LanguageUsedInStores</a> error is returned.</p>
     * @return languages
     */

    public java.util.List<String> getLanguages() {
        return this.languages;
    }

    /**
     * builds ProjectChangeLanguagesAction with checking for non-null required values
     * @return ProjectChangeLanguagesAction
     */
    public ProjectChangeLanguagesAction build() {
        Objects.requireNonNull(languages, ProjectChangeLanguagesAction.class + ": languages is missing");
        return new ProjectChangeLanguagesActionImpl(languages);
    }

    /**
     * builds ProjectChangeLanguagesAction without checking for non-null required values
     * @return ProjectChangeLanguagesAction
     */
    public ProjectChangeLanguagesAction buildUnchecked() {
        return new ProjectChangeLanguagesActionImpl(languages);
    }

    /**
     * factory method for an instance of ProjectChangeLanguagesActionBuilder
     * @return builder
     */
    public static ProjectChangeLanguagesActionBuilder of() {
        return new ProjectChangeLanguagesActionBuilder();
    }

    /**
     * create builder for ProjectChangeLanguagesAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProjectChangeLanguagesActionBuilder of(final ProjectChangeLanguagesAction template) {
        ProjectChangeLanguagesActionBuilder builder = new ProjectChangeLanguagesActionBuilder();
        builder.languages = template.getLanguages();
        return builder;
    }

}
