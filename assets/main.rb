require 'java'
java_import android.app.AlertDialog;
# Define method
def smd()
  alertDialog = new AlertDialog.Builder(this).create()
  alertDialog.setTitle "Reset..."
  alertDialog.setMessage "Are you sure?"
  alertDialog.show
end
# Call it
smd