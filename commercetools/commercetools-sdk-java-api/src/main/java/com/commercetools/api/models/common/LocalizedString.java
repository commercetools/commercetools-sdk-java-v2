
package com.commercetools.api.models.common;

import static com.commercetools.api.models.InternalUtils.*;
import static java.lang.String.format;
import static java.util.Objects.requireNonNull;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.annotation.*;

@JsonDeserialize(as = LocalizedStringImpl.class)
public interface LocalizedString {

    @NotNull
    @JsonAnyGetter
    public Map<String, String> values();

    @JsonAnySetter
    public void setValue(String key, String value);

    public static LocalizedString of() {
        return new LocalizedStringImpl();
    }

    public static LocalizedString of(final LocalizedString template) {
        LocalizedStringImpl instance = new LocalizedStringImpl();
        return instance;
    }

    public static LocalizedStringBuilder builder() {
        return LocalizedStringBuilder.of();
    }

    public static LocalizedStringBuilder builder(final LocalizedString template) {
        return LocalizedStringBuilder.of(template);
    }

    default <T> T withLocalizedString(Function<LocalizedString, T> helper) {
        return helper.apply(this);
    }

    @NotNull
    @JsonIgnore
    default public Map<Locale, String> localeValues() {
        return values().entrySet().stream().collect(Collectors.toMap(e -> new Locale(e.getKey()), Map.Entry::getValue));
    }

    /**
     * Creates an instance without any value.
     *
     * @return instance without any value
     */
    public static LocalizedString empty() {
        return of();
    }

    /**
     * Creates an instance with one locale translation pair.
     *
     * @param locale the locale for the one translation
     * @param value the translation for the specified locale
     * @return translation for one language
     */
    @JsonIgnore
    public static LocalizedString of(final Locale locale, final String value) {
        requireNonNull(locale);
        requireNonNull(value);
        return ofStringToStringMap(mapOf(locale.toLanguageTag(), value));
    }

    /**
     * Creates an instance for two different locales.
     *
     * @param locale1 the first locale
     * @param value1 the translation corresponding to {@code locale1}
     * @param locale2 the second locale which differs from {@code locale1}
     * @param value2 the translation corresponding to {@code locale2}
     * @return new instance for two key value pairs
     */
    @JsonIgnore
    public static LocalizedString of(final Locale locale1, final String value1, final Locale locale2,
            final String value2) {
        return ofStringToStringMap(mapOf(locale1.toLanguageTag(), value1, locale2.toLanguageTag(), value2));
    }

    /**
     * Creates an instance by supplying a map of {@link Locale} and {@link String}. Changes to the map won't affect the instance.
     *
     * @param translations the key value pairs for the translation
     * @return a new instance which has the same key value pairs as {@code translation} at creation time
     */
    @JsonIgnore
    public static LocalizedString of(final Map<Locale, String> translations) {
        requireNonNull(translations);
        return LocalizedString.ofStringToStringMap(translations.entrySet()
                .stream()
                .collect(Collectors.toMap(e -> e.getKey().toLanguageTag(), Map.Entry::getValue)));
    }

    /**
     * Creates an instance by supplying a map of {@link String} the language tag and {@link String}. Changes to the map won't affect the instance.
     *
     * @param translations the key value pairs for the translation
     * @return a new instance which has the same key value pairs as {@code translation} at creation time
     */
    @JsonIgnore
    public static LocalizedString ofStringToStringMap(final Map<String, String> translations) {
        requireNonNull(translations);
        return LocalizedStringBuilder.of().values(translations).build();
    }

    /**
     * Creates a new {@link LocalizedString} containing the given entries and the new one.
     * It is not allowed to override existing entries.
     *
     * @param locale the additional locale of the new entry
     * @param value the value for the <code>locale</code>
     * @return a LocalizedString containing this data and the from the parameters.
     * @throws IllegalArgumentException if duplicate locales are provided
     */
    default public LocalizedString plus(final Locale locale, final String value) {
        if (values().containsKey(locale.toLanguageTag())) {
            throw new IllegalArgumentException(format("Duplicate keys (%s) for map creation.", locale));
        }
        final Map<String, String> newMap = new HashMap<>(values());
        newMap.put(locale.toLanguageTag(), value);
        return LocalizedStringBuilder.of().values(newMap).build();
    }

    /**
     * Searches the translation for an exact locale and returning the result in an {@link Optional}.
     *
     * @param locale the locale which should be searched
     * @return A filled optional with the translation belonging to {@code locale} or an empty optional if the locale is not present.
     */
    @Nonnull
    default public Optional<String> find(final Locale locale) {
        return Optional.ofNullable(get(locale));
    }

    /**
     * Searches the translation for an exact locale by using {@code null} in the case the locale ist not present.
     *
     * @param locale the locale which should be searched
     * @return the translation belonging to {@code locale} or null if the locale is not present.
     */
    @Nullable
    default public String get(final Locale locale) {
        return values().get(locale.toLanguageTag());
    }

    /**
     * Searches the translation for a locale specified in IETF BCP 47 by language tag string.
     * If the specified language tag contains any ill-formed subtags, the first such subtag and all following subtags are ignored.
     *
     * @param languageTag the IETF language tag corresponding to an {@code Locale}
     * @return the translation belonging to {@code languageTag} or {@code null} if the locale is not present.
     */
    @Nullable
    default public String get(final String languageTag) {
        final Locale locale = Locale.forLanguageTag(languageTag);
        return get(locale);
    }

    /**
     * Searches the translation for some exact locales in the order they appear and returning the result in an {@link Optional}.
     *
     * @param locales the locale which should be searched, the first exact match wins
     * @return A filled optional with the translation belonging to one of the {@code locales} or an empty optional if none of the locales is not present.
     */
    @Nonnull
    default public Optional<String> find(final Iterable<Locale> locales) {
        final Optional<Locale> firstFoundLocale = toStream(locales)
                .filter(locale -> values().containsKey(locale.toLanguageTag()))
                .findFirst();
        return firstFoundLocale.map(foundLocale -> get(foundLocale.toLanguageTag()));
    }

    /**
     * Searches the translation for some exact locales in the order they appear and using null as result if no match could be found.
     *
     * @param locales the locale which should be searched, the first exact match wins
     * @return the translation belonging to one of the {@code locales} or null if none of the locales is not present.
     */
    @Nullable
    default public String get(final Iterable<Locale> locales) {
        return find(locales).orElse(null);
    }

    /**
     * Searches a translation which matches a locale in {@code locales} and uses language fallbackes.
     * If locales which countries are used then the algorithm searches also for the pure language locale.
     * So if "en_US" could not be found then "en" will be tried.
     *
     * @param locales the locales to try out
     * @return a translation matching one of the locales or null
     */
    @Nullable
    @JsonIgnore
    default public String getTranslation(final Iterable<Locale> locales) {
        return StreamSupport.stream(locales.spliterator(), false).map(localeToFind -> {
            String match = get(localeToFind);
            if (match == null) {
                final Locale pureLanguageLocale = new Locale(localeToFind.getLanguage());
                match = get(pureLanguageLocale);
            }
            return match;
        }).filter(Objects::nonNull).findFirst().orElse(null);
    }

    /**
     * Creates a new instance where each translation value is transformed with {@code function}.
     *
     * @param function transforms a value for a locale into a new value
     * @return a new {@link LocalizedString} which consist all elements for this transformed with {@code function}
     */
    default public LocalizedString mapValue(final BiFunction<Locale, String, String> function) {
        return stream().map(entry -> {
            final String newValue = function.apply(entry.getLocale(), entry.getValue());
            return LocalizedStringEntry.of(entry.getLocale(), newValue);
        }).collect(streamCollector());
    }

    /**
     * Creates a new Stream of entries.
     *
     * @return stream of all entries
     */
    default public Stream<LocalizedStringEntry> stream() {
        return values().entrySet().stream().map(entry -> LocalizedStringEntry.of(entry.getKey(), entry.getValue()));
    }

    /**
     * Collector to collect a stream of {@link LocalizedStringEntry}s to one {@link LocalizedString}.
     *
     * @return collector
     */
    public static Collector<LocalizedStringEntry, ?, LocalizedString> streamCollector() {
        final Collector<LocalizedStringEntry, Map<String, String>, LocalizedString> result = Collector.of(
            HashMap::new, (Map<String, String> tmpMap, LocalizedStringEntry entry) -> tmpMap
                    .put(entry.getLocale().toLanguageTag(), entry.getValue()),
            (Map<String, String> left, Map<String, String> right) -> {
                left.putAll(right);
                return left;
            }, (Map<String, String> entryMap) -> LocalizedStringBuilder.of().values(entryMap).build());
        return result;
    }

    /**
     * Creates a new {@link LocalizedString} where all translations are slugified (remove whitespace, etc.).
     *
     * @return new instance
     */
    default public LocalizedString slugified() {
        return mapValue((locale, value) -> slugify(value));
    }

    /**
     * Creates a new {@link LocalizedString} where all translations are slugified (remove whitespace, etc.) and a random supplement is added.
     * This slugify methods appends a random string for a little uniqueness.
     *
     * @return new instance
     */
    default public LocalizedString slugifiedUnique() {
        return mapValue((locale, value) -> slugifyUnique(value));
    }

    /**
     * Returns all locales included in this instance.
     *
     * @return locales
     */
    @JsonIgnore
    @Nonnull
    default public Set<Locale> getLocales() {
        return localeValues().keySet();
    }

    /**
     * Delivers an immutable map of the translation.
     *
     * @return the key-value pairs for the translation
     */
    @JsonIgnore
    default Map<Locale, String> getTranslations() {
        return immutableCopyOf(localeValues());
    }

    default void set(final Locale languageTag, final String value) {
        setValue(languageTag.toLanguageTag(), value);
    }

    /**
     * Creates a container which contains the full Java type information to deserialize this class from JSON.
     *
     * @return type reference
     */
    public static TypeReference<LocalizedString> typeReference() {
        return new TypeReference<LocalizedString>() {
            @Override
            public String toString() {
                return "TypeReference<LocalizedString>";
            }
        };
    }

    public static LocalizedString ofEnglish(final String translationForEnglish) {
        requireNonNull(translationForEnglish);
        return of(Locale.ENGLISH, translationForEnglish);
    }
}
