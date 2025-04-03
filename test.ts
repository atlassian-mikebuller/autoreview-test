import { Tags } from '@atlassian/metrics-interface';

/**
 * Helper function for creating metric-based tags
 * @example
 * ```
 * const tags = createTags({ foo: 'bar', baz: undefined }); // { foo: 'bar' }
 * ```
 */
export function createTags(obj: Record<string, string | undefined>): Tags {
    return Object.entries(obj).reduce<Tags>((acc, [key, val]) => {
        if (val) {
        acc[key] = val;
    }

        return acc;
    }, {});
}