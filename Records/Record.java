
package Records;

/**
 * Interface for managing records.
 *
 * @param <T> the type of record that this interface manages.
 */
public interface Record<T> {
    /**
     * Adds a record to the collection.
     *
     * @param record the record to add
     * @return true if the record was added successfully, false otherwise
     */
    boolean addRecord(T record);

    /**
     * Displays all records in the collection.
     */
    void viewRecords();
}
