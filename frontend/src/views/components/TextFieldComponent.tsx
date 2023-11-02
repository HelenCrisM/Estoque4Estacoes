import TextField from "@mui/material/TextField"

export const TextFieldComponent = (props:
  { id: string, label: string, name: string, autoComplete: string, type: string, onChange: any}
) => {

  return (
      <TextField
        margin="normal"
        required
        fullWidth
        id={props.id}
        label={props.label}
        name={props.name}
        autoComplete={props.autoComplete}
        type={props.type}
        onChange={props.onChange}
        variant="outlined"
        autoFocus
      /> 
  )
}