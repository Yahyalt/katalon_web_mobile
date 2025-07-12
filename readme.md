# Katalon Studio Web & Mobile Testing Project

This project contains automated test scripts for both web and mobile applications using Katalon Studio.

## 📋 Project Overview

This Katalon Studio project includes:
- **Mobile Testing**: Android application testing using APIDemos app
- **Web Testing**: Web application testing for CURA Healthcare Service and ParaBank
- **Test Suites**: Organized test execution for both mobile and web scenarios

## 🛠️ Prerequisites

### Required Software
1. **Katalon Studio** (Version 5.9.0 or higher)
   - Download from: https://www.katalon.com/
   - Free Community Edition available

2. **Java JDK** (Version 8 or higher)
   - Download from: https://www.oracle.com/java/technologies/downloads/
   - Set JAVA_HOME environment variable

### For Mobile Testing
3. **Android SDK/ADB**
   - Install Android Studio or standalone SDK tools
   - Set ANDROID_HOME environment variable
   - Add platform-tools to PATH

4. **Appium Server** (Optional - for advanced mobile testing)
   - Install via npm: `npm install -g appium`

5. **Android Device/Emulator**
   - Physical Android device with USB debugging enabled
   - Or Android Virtual Device (AVD) from Android Studio

### For Web Testing
6. **Web Browsers**
   - Chrome (recommended)
   - Firefox
   - Edge
   - Safari (Mac only)

## 📁 Project Structure

```
katalon_web_mobile/
├── Object Repository/          # Test object definitions
│   ├── Application/           # Mobile app objects
│   │   ├── Android/          # Android-specific objects
│   │   ├── Android2/         # Additional Android objects
│   │   └── Android3/         # Notification-related objects
│   └── Web/                  # Web application objects
│       ├── web1/             # CURA Healthcare objects
│       ├── web2/             # Login failure objects
│       └── web4/             # ParaBank objects
├── Scripts/                   # Test script implementations
│   ├── mobile/               # Mobile test scripts
│   └── Web/                  # Web test scripts
├── Test Cases/               # Test case definitions
│   ├── mobile/               # Mobile test cases
│   └── Web/                  # Web test cases
├── Test Suites/              # Test suite configurations
├── mobile_app/               # Mobile application files
│   └── APIDemos (1).apk      # Android demo app
├── Profiles/                 # Execution profiles
└── settings/                 # Project settings
```

## 🚀 Getting Started

### 1. Setup Environment

1. **Install Katalon Studio**
   ```bash
   # Download and install from https://www.katalon.com/
   ```

2. **Setup Android Environment** (for mobile testing)
   ```bash
   # Set environment variables
   export ANDROID_HOME=/path/to/android/sdk
   export PATH=$PATH:$ANDROID_HOME/platform-tools
   ```

3. **Verify Setup**
   ```bash
   # Check ADB connection
   adb devices
   
   # Check Java installation
   java -version
   ```

### 2. Open Project

1. Launch Katalon Studio
2. Select "Open Project"
3. Navigate to project folder and select `mobile android.prj`

### 3. Configure Mobile Testing

1. **Update APK Path**
   - Navigate to `Scripts/mobile/TC_android_visibility/Script1694406741606.groovy`
   - Update the APK path to match your system:
   ```groovy
   Mobile.startApplication('C:\\Users\\LENOVO\\Katalon Studio\\mobile android\\mobile_app\\APIDemos (1).apk', true)
   ```

2. **Connect Android Device**
   - Enable Developer Options and USB Debugging
   - Connect via USB cable
   - Verify connection: `adb devices`

## 🏃‍♂️ Running Tests

### Mobile Test Cases

#### Available Mobile Tests:
1. **TC_android_visibility** - Tests UI element visibility
2. **TC_android_animation** - Tests animation features
3. **TC_android_notification_long** - Tests long notifications
4. **TC_android_notification_short** - Tests short notifications

#### Run Mobile Tests:
```bash
# Run individual test case
Right-click on test case → Run

# Run mobile test suite
Right-click on "Mobile-android" test suite → Run
```

### Web Test Cases

#### Available Web Tests:
1. **TC_Web_make an appointment** - CURA Healthcare appointment booking
2. **TC_Web_Fail Login** - Login failure scenario
3. **TC_Web_Register** - ParaBank user registration

#### Run Web Tests:
```bash
# Run individual test case
Right-click on test case → Run

# Run web test suite
Right-click on "Web" test suite → Run
```

## 🔧 Configuration

### Mobile Configuration
- **Device Settings**: Configure in Project Settings → Desired Capabilities
- **App Path**: Update APK path in mobile test scripts
- **Timeout Settings**: Configure in Test Suite settings

### Web Configuration
- **Browser Settings**: Configure in Project Settings → Execution
- **Wait Settings**: Configure implicit/explicit waits
- **Base URLs**: Update in GlobalVariable if needed

## 📊 Test Reports

After test execution, reports are generated in:
- `Reports/` folder (HTML reports)
- Katalon Studio built-in reports
- Console output for immediate feedback

## 🎯 Test Scenarios

### Mobile Test Scenarios
- **Visibility Testing**: Verify UI elements show/hide correctly
- **Animation Testing**: Test app animations and transitions
- **Notification Testing**: Verify notification display and behavior

### Web Test Scenarios
- **Healthcare Appointment**: Complete appointment booking flow
- **Login Validation**: Test login success/failure scenarios
- **User Registration**: Test user account creation

## 🔍 Troubleshooting

### Common Mobile Issues
1. **Device Not Found**
   ```bash
   # Check ADB connection
   adb devices
   # Restart ADB server
   adb kill-server && adb start-server
   ```

2. **App Installation Failed**
   - Check APK path is correct
   - Verify device has enough storage
   - Enable "Install from unknown sources"

3. **Appium Connection Issues**
   - Verify Appium server is running
   - Check port configuration (default: 4723)

### Common Web Issues
1. **Browser Driver Issues**
   - Katalon usually auto-manages drivers
   - Check browser version compatibility

2. **Element Not Found**
   - Verify page load timing
   - Check element locators in Object Repository

3. **Network Issues**
   - Verify internet connection
   - Check if test URLs are accessible

## 📝 Best Practices

1. **Object Repository Management**
   - Use descriptive object names
   - Group related objects in folders
   - Regular cleanup of unused objects

2. **Test Data Management**
   - Use external data files for test data
   - Implement data-driven testing
   - Secure sensitive data (passwords)

3. **Test Script Maintenance**
   - Add meaningful comments
   - Use proper error handling
   - Implement reusable keywords

## 🤝 Contributing

1. Follow existing code structure
2. Add proper documentation
3. Test thoroughly before committing
4. Update this README for new features

## 📞 Support

For Katalon Studio specific issues:
- Official Documentation: https://docs.katalon.com/
- Community Forum: https://forum.katalon.com/
- GitHub Issues: Project-specific issues

---

**Note**: This project is configured for Windows environment. Adjust paths and commands accordingly for macOS/Linux systems.
