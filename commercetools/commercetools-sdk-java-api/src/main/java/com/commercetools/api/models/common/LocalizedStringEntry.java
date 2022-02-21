
package com.commercetools.api.models.common;

import java.util.Locale;

public final class LocalizedStringEntry {
    private final Locale locale;
    private final String value;

    private LocalizedStringEntry(final Locale locale, final String value) {
        this.locale = locale;
        this.value = value;
    }

    public static LocalizedStringEntry of(final Locale locale, final String value) {
        return new LocalizedStringEntry(locale, value);
    }

    /**
     * Creates an entry for language tag and a value.
     *
     * <p>The language tag can be just a language code or language and a country</p>
     *
     * @param languageTag language tag as in {@link Locale#forLanguageTag(String)}
     * @param value value of this entry
     * @return entry
     */
    public static LocalizedStringEntry of(final String languageTag, final String value) {
        final Locale locale = Locale.forLanguageTag(languageTag);
        return of(locale, value);
    }

    public Locale getLocale() {
        return locale;
    }

    public String getValue() {
        return value;
    }
}
