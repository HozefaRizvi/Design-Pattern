/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DecoratorPattern;

/**
 *
 * @author TechEnclave Computer
 */
import java.nio.charset.StandardCharsets;

// The component interface defines operations that can be
// altered by decorators.
interface DataSource {
    void writeData(String data);
    String readData();
}

// Concrete components provide default implementations for the
// operations. There might be several variations of these
// classes in a program.
class FileDataSource implements DataSource {
    private String filename;

    public FileDataSource(String filename) {
        this.filename = filename;
    }

    public void writeData(String data) {
        // Write data to the file.
        // Implementation omitted for brevity.
    }

    public String readData() {
        // Read data from the file.
        // Implementation omitted for brevity.
        return "";
    }
}

// The base decorator class follows the same interface as the
// other components. The primary purpose of this class is to
// define the wrapping interface for all concrete decorators.
// The default implementation of the wrapping code might include
// a field for storing a wrapped component and the means to
// initialize it.
class DataSourceDecorator implements DataSource {
    protected DataSource wrappee;

    public DataSourceDecorator(DataSource source) {
        this.wrappee = source;
    }

    public void writeData(String data) {
        wrappee.writeData(data);
    }

    public String readData() {
        return wrappee.readData();
    }
}

// Concrete decorators must call methods on the wrapped object,
// but may add something of their own to the result. Decorators
// can execute the added behavior either before or after the
// call to a wrapped object.
class EncryptionDecorator extends DataSourceDecorator {
    public EncryptionDecorator(DataSource source) {
        super(source);
    }

    public void writeData(String data) {
        // Encrypt passed data.
        // Pass encrypted data to the wrappee's writeData method.
        // Implementation omitted for brevity.
    }

    public String readData() {
        // Get data from the wrappee's readData method.
        // Try to decrypt it if it's encrypted.
        // Return the result.
        // Implementation omitted for brevity.
        return "";
    }
}

// You can wrap objects in several layers of decorators.
class CompressionDecorator extends DataSourceDecorator {
    public CompressionDecorator(DataSource source) {
        super(source);
    }

    public void writeData(String data) {
        // Compress passed data.
        // Pass compressed data to the wrappee's writeData method.
        // Implementation omitted for brevity.
    }

    public String readData() {
        // Get data from the wrappee's readData method.
        // Try to decompress it if it's compressed.
        // Return the result.
        // Implementation omitted for brevity.
        return "";
    }
}

// New decorator to handle UTF-8 encoding/decoding
class UTF8Decorator extends DataSourceDecorator {
    public UTF8Decorator(DataSource source) {
        super(source);
    }

    @Override
    public void writeData(String data) {
        // Encode data to UTF-8 before writing it
        byte[] utf8Data = data.getBytes(StandardCharsets.UTF_8);
        String encodedData = new String(utf8Data, StandardCharsets.UTF_8);
        wrappee.writeData(encodedData);
    }

    @Override
    public String readData() {
        // Read data and decode it from UTF-8
        String encodedData = wrappee.readData();
        byte[] utf8Data = encodedData.getBytes(StandardCharsets.UTF_8);
        return new String(utf8Data, StandardCharsets.UTF_8);
    }
}